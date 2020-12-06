import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
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
import java.awt.Toolkit;

public class Project342 {

	private JFrame frmSocialface;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project342 window = new Project342();
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
	public Project342() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\eclipse-workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBackground(Color.WHITE);
		frmSocialface.setBounds(100, 100, 458, 473);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblSocialface = new JLabel("SocialFace");
		lblSocialface.setBounds(140, 55, 172, 38);
		lblSocialface.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		JButton btnPassword = new JButton("Sign Up");
		btnPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnPassword.setBounds(178, 311, 97, 25);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(178, 165, 97, 22);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(178, 211, 97, 22);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblUsername.setBounds(84, 168, 91, 16);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblPassword.setBounds(84, 214, 82, 16);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		btnLogin.setBounds(178, 246, 97, 22);
		frmSocialface.getContentPane().setLayout(null);
		frmSocialface.getContentPane().add(lblUsername);
		frmSocialface.getContentPane().add(txtUsername);
		frmSocialface.getContentPane().add(lblPassword);
		frmSocialface.getContentPane().add(btnPassword);
		frmSocialface.getContentPane().add(passwordField);
		frmSocialface.getContentPane().add(btnLogin);
		frmSocialface.getContentPane().add(lblSocialface);
		
		JLabel lblOr = new JLabel("or");
		lblOr.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		lblOr.setBounds(218, 281, 41, 16);
		frmSocialface.getContentPane().add(lblOr);
	}
}
