
/*****  THIS IS A GUI FOR SIGNING UP  *****/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class signupGUI {

	private JFrame signupFrame = new JFrame();
	private JTextField usernameTF = new JTextField();
	private JPasswordField password1TF = new JPasswordField();
	private JPasswordField password2TF = new JPasswordField();
	private String username;
	private char[] password1, password2;

	public signupGUI() {
		signupFrame.setTitle("Sign Up");
		signupFrame.setSize(500, 300);
		signupFrame.setLocation(600, 200);
		signupFrame.setResizable(false);
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\images\\icon.png");
		signupFrame.setIconImage(icon);
		JPanel layout = new JPanel();
		layout.setLayout(null);

		background();
		copyright();
		forms();

		signupFrame.setVisible(true);
	}

	public void background() {
		try {
			JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("..\\images\\signup-background.png"))));
			signupFrame.setContentPane(label);
		} catch (IOException e) {
			System.out.println("Image doesn't exist...");
		}
	}

	public void copyright() {
		JLabel title = new JLabel("Copyright © 2019 Developer DRIOUECHE Mohammed");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial", Font.PLAIN, 10));
		title.setBounds(10, 255, 300, 12);
		signupFrame.getContentPane().add(title);
	}

	public void labels() {
		JLabel usernameLabel = new JLabel("Enter your username :");
		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		usernameLabel.setBounds(80, 65, 150, 50);
		signupFrame.getContentPane().add(usernameLabel);
		JLabel passwordLabel1 = new JLabel("Enter your password :");
		passwordLabel1.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordLabel1.setBounds(80, 115, 150, 50);
		signupFrame.getContentPane().add(passwordLabel1);
		JLabel passwordLabel2 = new JLabel("Retype your password :");
		passwordLabel2.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordLabel2.setBounds(80, 165, 150, 50);
		signupFrame.getContentPane().add(passwordLabel2);
	}

	public void textfield() {
		usernameTF.setBounds(225, 80, 150, 18);
		signupFrame.getContentPane().add(usernameTF);
		password1TF.setBounds(225, 130, 150, 18);
		signupFrame.getContentPane().add(password1TF);
		password2TF.setBounds(225, 180, 150, 18);
		signupFrame.getContentPane().add(password2TF);
	}

	public void button() {
		JButton signupButton = new JButton("Sign up");
		signupButton.setForeground(Color.BLACK);
		signupButton.setBackground(Color.LIGHT_GRAY);
		signupButton.setBounds(350, 230, 100, 20);
		signupFrame.getContentPane().add(signupButton);
		signupButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				database db = new database();
				username = usernameTF.getText();
				password1 = password1TF.getPassword();
				password2 = password2TF.getPassword();
				db.charger();
				if (Arrays.equals(password1, password2) && db.doesntExist(username, password1)) {
					Player P = new Player(username, password1);
					db.inserer(P);
					db.ClosingDB();
					JOptionPane.showMessageDialog(signupFrame, "Sign up successful !", "Message",
							JOptionPane.INFORMATION_MESSAGE);
					signupFrame.dispose();
				}else if (db.isExist(username, password1)) {
					JOptionPane.showMessageDialog(signupFrame, "Username is already taken. Try again.",
							"Error Message", JOptionPane.ERROR_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(signupFrame, "passwords are not identical. Try again.",
							"Error Message", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
	}

	public void forms() {
		labels();
		textfield();
		button();
	}

}
