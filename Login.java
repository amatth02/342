import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Login {

	JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("SocialFace");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Workspace\\EPL342\\src\\logo.jpg"));
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 870, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSocialface = new JLabel("SocialFace");
		lblSocialface.setBounds(345, 42, 172, 38);
		lblSocialface.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		JButton btnPassword = new JButton("Sign Up");
		btnPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//open the registration window
				NewAccount nw =new NewAccount();
				nw.Registration();	
			}
		});
		btnPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnPassword.setBounds(383, 298, 97, 25);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(383, 152, 97, 22);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(383, 198, 97, 22);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblUsername.setBounds(289, 155, 91, 16);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblPassword.setBounds(289, 201, 82, 16);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserProfile nw = new UserProfile();
				nw.profile();
			}
		});
		btnLogin.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnLogin.setBounds(383, 233, 97, 22);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblUsername);
		frame.getContentPane().add(txtUsername);
		frame.getContentPane().add(lblPassword);
		frame.getContentPane().add(btnPassword);
		frame.getContentPane().add(passwordField);
		frame.getContentPane().add(btnLogin);
		frame.getContentPane().add(lblSocialface);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblOr.setBounds(423, 268, 41, 16);
		frame.getContentPane().add(lblOr);
	}
}
