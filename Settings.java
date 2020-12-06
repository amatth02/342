import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.Action;
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
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionEvent;
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

public class Settings extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void button() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Settings() {
		setTitle("SocialFace");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Georgia\\Workspace\\EPL342\\src\\logo.jpg"));
		
	//	contentPane.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Workspace\\EPL342\\src\\logo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Settings");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Settings_Priv nwind =new Settings_Priv();
				nwind.Settings_privacy();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Georgia\\Workspace\\EPL342\\Settings-2-icon.png"));
		btnNewButton.setBounds(38, 58, 145, 62);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 142, 145, 2);
		contentPane.add(separator);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(74, 157, 71, 16);
		contentPane.add(lblUsername);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(38, 201, 145, 2);
		contentPane.add(separator_1);
		
		JButton btnSignOut = new JButton("Sign out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login back =new Login();
				back.frame.setVisible(true);
				Settings frame = new Settings();
				frame.setVisible(false);
			}
		});
		btnSignOut.setIcon(new ImageIcon("C:\\Users\\Georgia\\Workspace\\EPL342\\general_pack_new_glyph_logout_.png"));
		btnSignOut.setBounds(38, 216, 145, 55);
		contentPane.add(btnSignOut);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserProfile nw = new UserProfile();
				nw.profile();
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Georgia\\Workspace\\EPL342\\Arrow-Back-4-icon.png"));
		button.setBounds(0, 327, 41, 25);
		contentPane.add(button);
	
	
	}
}
