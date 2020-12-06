import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class AddEvent {

	private JFrame frmSocialface;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void events() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEvent window = new AddEvent();
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
	public AddEvent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Georgia\\Workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBounds(100, 100, 441, 500);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel lblAddEvent = new JLabel("Add Event");
		lblAddEvent.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAddEvent.setBounds(91, 48, 139, 31);
		frmSocialface.getContentPane().add(lblAddEvent);
		
		JLabel lblNewLabel = new JLabel("Name of Event");
		lblNewLabel.setBounds(43, 112, 131, 31);
		frmSocialface.getContentPane().add(lblNewLabel);
		
		JLabel lblStartTime = new JLabel("Start Time");
		lblStartTime.setBounds(43, 178, 85, 22);
		frmSocialface.getContentPane().add(lblStartTime);
		
		JLabel lblNewLabel_1 = new JLabel("End Time");
		lblNewLabel_1.setBounds(43, 213, 56, 16);
		frmSocialface.getContentPane().add(lblNewLabel_1);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(43, 248, 56, 16);
		frmSocialface.getContentPane().add(lblAddress);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setBounds(43, 277, 56, 16);
		frmSocialface.getContentPane().add(lblNumber);
		
		JLabel lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(43, 306, 56, 16);
		frmSocialface.getContentPane().add(lblZipCode);
		
		JLabel lblPrivacy = new JLabel("Privacy");
		lblPrivacy.setBounds(43, 335, 56, 16);
		frmSocialface.getContentPane().add(lblPrivacy);
		
		textField = new JTextField();
		textField.setBounds(186, 116, 116, 22);
		frmSocialface.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(186, 178, 116, 22);
		frmSocialface.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(186, 210, 116, 22);
		frmSocialface.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(186, 245, 116, 22);
		frmSocialface.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(186, 274, 116, 22);
		frmSocialface.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(186, 303, 116, 22);
		frmSocialface.getContentPane().add(textField_5);
		
		String []strcombo = {"Public", "Private", "Close"};
		JComboBox comboBox = new JComboBox(strcombo);
		comboBox.setBounds(186, 335, 116, 22);
		frmSocialface.getContentPane().add(comboBox);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(43, 149, 56, 16);
		frmSocialface.getContentPane().add(lblDate);
		
		textField_6 = new JTextField();
		textField_6.setBounds(186, 146, 116, 22);
		frmSocialface.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserProfile nw = new UserProfile();
				nw.profile();
			}
		});
		btnSave.setBounds(115, 396, 97, 25);
		frmSocialface.getContentPane().add(btnSave);
		
		
	}
}
