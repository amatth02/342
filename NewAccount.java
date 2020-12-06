import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class NewAccount {

	private JFrame frmSocialface;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtUsername;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void Registration() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccount window = new NewAccount();
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
	public NewAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Georgia\\Workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBounds(100, 100, 546, 491);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("First Name");
		lblName.setBounds(153, 129, 93, 16);
		frmSocialface.getContentPane().add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(153, 155, 93, 16);
		frmSocialface.getContentPane().add(lblLastName);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(153, 184, 69, 16);
		frmSocialface.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(153, 283, 56, 16);
		frmSocialface.getContentPane().add(lblBirthday);
		
		JLabel lblWork = new JLabel("Gender");
		lblWork.setBounds(153, 251, 56, 16);
		frmSocialface.getContentPane().add(lblWork);
		
		String []strcombo = {"Female", "Male", "Other"};
		JComboBox comboBox = new JComboBox(strcombo);
		comboBox.setBounds(254, 241, 84, 27);
		comboBox.setSelectedIndex(2);
		//comboBox.addActionListener((ActionListener) this);
		frmSocialface.getContentPane().add(comboBox);
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(255, 126, 116, 22);
		txtFirstname.setHorizontalAlignment(SwingConstants.CENTER);
		frmSocialface.getContentPane().add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtLastname = new JTextField();
		txtLastname.setBounds(255, 152, 116, 22);
		txtLastname.setHorizontalAlignment(SwingConstants.CENTER);
		frmSocialface.getContentPane().add(txtLastname);
		txtLastname.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(255, 181, 116, 22);
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		frmSocialface.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(255, 280, 116, 22);
		frmSocialface.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserProfile nw = new UserProfile();
				nw.profile();
			}
		});
		btnCreate.setBounds(199, 317, 97, 25);
		frmSocialface.getContentPane().add(btnCreate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 206, 116, 22);
		frmSocialface.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(153, 213, 56, 16);
		frmSocialface.getContentPane().add(lblEmail);
		
		
		JLabel label = new JLabel("Register");
		label.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		label.setBounds(183, 38, 136, 43);
		frmSocialface.getContentPane().add(label);
		
		
	}
}
