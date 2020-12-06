import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddQuote {

	private JFrame frmSocialface;
	private JTextField txtIsYourTime;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void quotes(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddQuote window = new AddQuote();
					window.frmSocialface.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddQuote() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Georgia\\Workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBounds(100, 100, 484, 362);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel lblAddQuote = new JLabel("Add Quote");
		lblAddQuote.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddQuote.setBounds(98, 96, 113, 28);
		frmSocialface.getContentPane().add(lblAddQuote);
		
		txtIsYourTime = new JTextField();
		txtIsYourTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIsYourTime.setText("Is your time to shine like a diamond...");
		txtIsYourTime.setBounds(94, 144, 231, 28);
		frmSocialface.getContentPane().add(txtIsYourTime);
		txtIsYourTime.setColumns(10);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserProfile nw = new UserProfile();
				nw.profile();
			}
		});
		btnSave.setBounds(148, 249, 97, 25);
		frmSocialface.getContentPane().add(btnSave);
	}
}
