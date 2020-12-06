import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddPhoto {

	private JFrame frmSocialface;

	/**
	 * Launch the application.
	 */
	public static void photo() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPhoto window = new AddPhoto();
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
	public AddPhoto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSocialface = new JFrame();
		frmSocialface.setTitle("SocialFace");
		frmSocialface.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Workspace\\EPL342\\src\\logo.jpg"));
		frmSocialface.setBounds(100, 100, 323, 322);
		frmSocialface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSocialface.getContentPane().setLayout(null);
		
		JLabel lblAddPhoto = new JLabel("Add Photo");
		lblAddPhoto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddPhoto.setBounds(38, 80, 139, 51);
		frmSocialface.getContentPane().add(lblAddPhoto);
		
		JButton btnChooseFromLibrary = new JButton("Choose From Library");
		btnChooseFromLibrary.setBounds(34, 144, 170, 25);
		frmSocialface.getContentPane().add(btnChooseFromLibrary);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserProfile nw = new UserProfile();
				nw.profile();
			}
		});
		btnSave.setBounds(64, 206, 97, 25);
		frmSocialface.getContentPane().add(btnSave);
	}
}
