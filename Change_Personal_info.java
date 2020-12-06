import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Change_Personal_info {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void change_info() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change_Personal_info window = new Change_Personal_info();
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
	public Change_Personal_info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSaveAndBack = new JButton("Save");
		btnSaveAndBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings_Priv nw =new Settings_Priv();
				nw.Settings_privacy();
			}
		});
		btnSaveAndBack.setBounds(81, 225, 202, 25);
		frame.getContentPane().add(btnSaveAndBack);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(25, 95, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Change personal informations");
		lblNewLabel_1.setBounds(25, 44, 182, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JEditorPane dtrpnUsername = new JEditorPane();
		dtrpnUsername.setText("Username\r\n");
		dtrpnUsername.setBounds(114, 95, 159, 22);
		frame.getContentPane().add(dtrpnUsername);
		
		JLabel lblDateOfBirth = new JLabel("Birthday");
		lblDateOfBirth.setBounds(25, 125, 85, 16);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(25, 154, 75, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(25, 183, 56, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(114, 122, 159, 22);
		frame.getContentPane().add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(112, 154, 202, 22);
		frame.getContentPane().add(editorPane_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(351, 24, 14, 365);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(25, 296, 407, 2);
		frame.getContentPane().add(separator_1);
	}
}
