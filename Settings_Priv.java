import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Settings_Priv {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Settings_privacy() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings_Priv window = new Settings_Priv();
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
	public Settings_Priv() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("SocialFace");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Workspace\\EPL342\\src\\logo.jpg"));
		frame.setBounds(100, 100, 335, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Settings");
		label.setBounds(22, 73, 56, 16);
		frame.getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setBounds(77, 62, 2, 298);
		frame.getContentPane().add(separator);
		
		JLabel label_1 = new JLabel("Privacy");
		label_1.setBounds(22, 302, 56, 16);
		frame.getContentPane().add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(12, 285, 297, 2);
		frame.getContentPane().add(separator_1);
		
		String []strcombo = {"Open", "Closed", "Friend","Network"};
		JComboBox comboBox = new JComboBox(strcombo);
		comboBox.setBounds(116, 299, 123, 22);
		comboBox.setSelectedIndex(3);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Change personal informations");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Change_Personal_info nw = new Change_Personal_info();
				nw.change_info();
			}
		});
		btnNewButton.setBounds(90, 110, 219, 25);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnChangePassword = new JButton("Change password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_Password nw = new Change_Password();
				nw.change_password();
			}
		});
		btnChangePassword.setBounds(117, 156, 145, 25);
		frame.getContentPane().add(btnChangePassword);
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings nw = new Settings();
				nw.button();
			}
		});
		button.setBounds(207, 24, 98, 25);
		frame.getContentPane().add(button);
	}
}
