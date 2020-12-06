import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Change_Password {

	private JFrame frmSocialface;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void change_password() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change_Password window = new Change_Password();
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
	public Change_Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Georgia\\Workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBounds(100, 100, 450, 300);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Change password");
		label.setBounds(54, 13, 166, 16);
		frmSocialface.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("old password");
		label_1.setBounds(91, 77, 94, 16);
		frmSocialface.getContentPane().add(label_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(241, 74, 101, 22);
		frmSocialface.getContentPane().add(passwordField);
		
		JLabel label_2 = new JLabel("new password");
		label_2.setBounds(91, 109, 83, 16);
		frmSocialface.getContentPane().add(label_2);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(241, 106, 101, 22);
		frmSocialface.getContentPane().add(passwordField_1);
		
		JLabel label_3 = new JLabel("verified new password");
		label_3.setBounds(91, 144, 129, 16);
		frmSocialface.getContentPane().add(label_3);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(241, 141, 101, 22);
		frmSocialface.getContentPane().add(passwordField_2);
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings_Priv nw =new Settings_Priv();
				nw.Settings_privacy();
			}
		});
		button.setBounds(114, 176, 202, 25);
		frmSocialface.getContentPane().add(button);
	}

}
