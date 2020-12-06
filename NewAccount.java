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

public class NewAccount {

	private JFrame frame;
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
	public NewAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("First Name");
		lblName.setBounds(153, 129, 93, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(153, 155, 93, 16);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setBounds(153, 184, 69, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblBirthday = new JLabel("Birthday");
		lblBirthday.setBounds(153, 283, 56, 16);
		frame.getContentPane().add(lblBirthday);
		
		JLabel lblWork = new JLabel("Gender");
		lblWork.setBounds(153, 251, 56, 16);
		frame.getContentPane().add(lblWork);
		
		String []strcombo = {"Female", "Male", "Other"};
		JComboBox comboBox = new JComboBox(strcombo);
		comboBox.setBounds(254, 241, 84, 27);
		comboBox.setSelectedIndex(2);
		//comboBox.addActionListener((ActionListener) this);
		frame.getContentPane().add(comboBox);
		
		txtFirstname = new JTextField();
		txtFirstname.setBounds(255, 126, 116, 22);
		txtFirstname.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txtFirstname);
		txtFirstname.setColumns(10);
		
		txtLastname = new JTextField();
		txtLastname.setBounds(255, 152, 116, 22);
		txtLastname.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txtLastname);
		txtLastname.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(255, 181, 116, 22);
		txtUsername.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(255, 280, 185, 22);
		textField.setText("\u03BD\u03B1 \u03B2\u03C1\u03BF\u03CD\u03BC\u03B5 \u03B7\u03BC\u03B5\u03C1\u03BF\u03BB\u03CC\u03B3\u03B9\u03BF");
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(199, 317, 97, 25);
		frame.getContentPane().add(btnCreate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 206, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(153, 213, 56, 16);
		frame.getContentPane().add(lblEmail);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(0, 411, 36, 33);
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\Georgia\\Workspace\\EPL342\\src\\Arrow-Back-4-icon.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Login back = new Login();
				back.frame.getOwnerlessWindows();
			}
		});
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setForeground(SystemColor.controlHighlight);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Georgia\\Workspace\\EPL342\\Arrow-Back-4-icon.png"));
		
		JLabel label = new JLabel("Register");
		label.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		label.setBounds(183, 38, 136, 43);
		frame.getContentPane().add(label);
		
		
	}
}
