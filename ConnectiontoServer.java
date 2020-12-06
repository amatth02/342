import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public abstract class ConnectiontoServer {
	private static boolean dbDriverLoaded = false;

    private static Connection conn = null;

    // handling the keyboard inputs through a BufferedReader

    // This variable became global for your convenience.

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));



    /**

    * A method that returns a connection to MS SQL server DB

    *

    * @return The connection object to be used.

    */

    public static Connection getDBConnection() {

                 String dbConnString = "jdbc:sqlserver://APOLLO.IN.CS.UCY.AC.CY:1433;databaseName=amatth02;user=amatth02;password=PqcuhZL8;";

                 if (!dbDriverLoaded)
                               try {
                                             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                                             dbDriverLoaded = true;
                               } catch (ClassNotFoundException e) {
                                             System.out.println("Cannot load DB driver!");
                                             return null;
                               }
                 try {
                               if (conn == null)
                                             conn = DriverManager.getConnection(dbConnString);
                               else if (conn.isClosed())
                                             conn = DriverManager.getConnection(dbConnString);
                 } catch (SQLException e) {
                               System.out.print("Cannot connect to the DB!\nGot error: ");
                               System.out.print(e.getErrorCode());
                               System.out.print("\nSQL State: ");
                               System.out.println(e.getSQLState());
                               System.out.println(e.getMessage());

                 }

                 return conn;

    }
	public static void main(String [] arcs) {
		System.out.print("connected");
		Scanner file=null;
//		String cityName="";
		try {
            file = new Scanner(new FileInputStream("C:\\Users\\User\\Desktop\\project-342\\testing.txt"));
            file.nextLine();
            while (file.hasNextLine()) {
                          String line = file.nextLine();
                String table[] = line.split("\t");
//                          System.out.println(table[0]);
//                          cityName=table[1];
                
            
                try {
                    CallableStatement cstmt = getDBConnection().prepareCall("{call amatth02.sttesting(?}");
                    cstmt.setString("andri", table[0]);
                  
                    cstmt.execute();

       } catch (SQLException e) {
                    e.printStackTrace();
       }
}

file.close();

} catch (FileNotFoundException e) {
	
//                          try {
//                                       CallableStatement cstmt = getDBConnection().prepareCall("{call amatth02.streq(?,?,?,?)}");
//                                       cstmt.setString("userID", table[0]);
//                                       cstmt.setString("friendID", table[1]);
//                                       cstmt.setString("rejected", table[2]);
//                                       cstmt.setString("ignore", table[3]);
//                                       cstmt.execute();
//
//                          } catch (SQLException e) {
//                                       e.printStackTrace();
//                          }
//            }
//
//            file.close();
//
//} catch (FileNotFoundException e) {

            System.out.println("No file was found");

}
		
	}
}
