import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JSlider;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserProfile {

	private JFrame frmSocialface;

	/**
	 * Launch the application.
	 */
	public static void profile() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile window = new UserProfile();
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
	public UserProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\eclipse-workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBounds(100, 100, 595, 723);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EPL342\\src\\profile-icon.png"));
		lblNewLabel.setBounds(69, 50, 57, 77);
		frmSocialface.getContentPane().add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setBounds(61, 119, 80, 31);
		frmSocialface.getContentPane().add(lblUserName);
		
		JLabel lblVideos = new JLabel("Posts");
		lblVideos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVideos.setBounds(331, 102, 56, 16);
		frmSocialface.getContentPane().add(lblVideos);
		
		JLabel lblFriends = new JLabel("Friends");
		lblFriends.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFriends.setBounds(243, 102, 56, 16);
		frmSocialface.getContentPane().add(lblFriends);
		
		JLabel label = new JLabel("1000");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(243, 78, 41, 16);
		frmSocialface.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("26");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(339, 78, 24, 16);
		frmSocialface.getContentPane().add(label_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Settings nw =new Settings();
				nw.button();
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\User\\eclipse-workspace\\EPL342\\src\\Menu-icon.png"));
		button.setBounds(508, 13, 57, 41);
		frmSocialface.getContentPane().add(button);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(526, 290, 21, 211);
		frmSocialface.getContentPane().add(scrollBar);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(44, 173, 490, 16);
		frmSocialface.getContentPane().add(separator);
		
		JButton btnPhotos = new JButton("Photos");
		btnPhotos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPhoto nw = new AddPhoto();
				nw.photo();
			}
		});
		btnPhotos.setBounds(44, 225, 97, 25);
		frmSocialface.getContentPane().add(btnPhotos);
		
		JButton btnVideos = new JButton("Videos");
		btnVideos.setBounds(44, 316, 97, 25);
		frmSocialface.getContentPane().add(btnVideos);
		
		JButton btnAlbums = new JButton("Albums");
		btnAlbums.setBounds(44, 413, 97, 25);
		frmSocialface.getContentPane().add(btnAlbums);
		
		JButton btnEvents = new JButton("Events");
		btnEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEvent nw = new AddEvent();
				nw.events();
			}
		});
		btnEvents.setBounds(44, 507, 97, 25);
		frmSocialface.getContentPane().add(btnEvents);
		
		JButton btnQuotes = new JButton("Quotes");
		btnQuotes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddQuote nw = new AddQuote();
				nw.quotes();
			}
		});
		
		btnQuotes.setBounds(44, 614, 97, 25);
		frmSocialface.getContentPane().add(btnQuotes);
		
		String []strcombo = {"Add Photo", "Add Video", "Add Album", "Add Event", "Add Quote"};
		JComboBox comboBox1 = new JComboBox(strcombo);
		comboBox1.setBounds(436, 13, 66, 41);
		comboBox1.setSelectedIndex(2);
		//comboBox.addActionListener((ActionListener) this);
		frmSocialface.getContentPane().add(comboBox1);
	}
}
