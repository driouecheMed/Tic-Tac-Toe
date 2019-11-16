
/*******  THIS IS A LOGIN GUI FOR THE MAIN PLAYER  ********/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginGUI extends window {

	protected JTextField username = new JTextField();
	protected JPasswordField password = new JPasswordField();
	private static String playerName; // see getter method at the end of the class

	public loginGUI() {

		super.frame.setTitle("Login");
		try {
			JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("..\\images\\login-background.png"))));
			frame.setContentPane(label);
		} catch (IOException e) {
			System.out.println("Image doesn't exist...");
		}

		copyright();
		labels();
		textField();
		startButton();
		signup();

		super.frame.setVisible(true);
	}

	public void copyright() {
		JLabel CR = new JLabel("Copyright © 2019 Developer DRIOUECHE Mohammed");
		CR.setForeground(Color.WHITE);
		CR.setFont(new Font("Arial", Font.PLAIN, 10));
		CR.setBounds(130, 490, 300, 50);
		frame.getContentPane().add(CR);
	}

	public void labels() {
		JLabel usernameLabel = new JLabel("username :");
		JLabel passwordLabel = new JLabel("password :");

		usernameLabel.setForeground(Color.LIGHT_GRAY);
		usernameLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		usernameLabel.setBounds(80, 150, 150, 50);
		super.frame.getContentPane().add(usernameLabel);
		passwordLabel.setForeground(Color.LIGHT_GRAY);
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		passwordLabel.setBounds(80, 200, 150, 50);
		super.frame.getContentPane().add(passwordLabel);
	}

	public void textField() {
		username.setBounds(160, 165, 150, 15);
		super.frame.getContentPane().add(username);
		password.setBounds(160, 215, 150, 15);
		super.frame.getContentPane().add(password);
	}

	public void startButton() {
		JButton start = new JButton("START");
		start.setForeground(Color.BLACK);
		start.setBackground(Color.LIGHT_GRAY);
		start.setBounds(210, 260, 100, 20);
		super.frame.getContentPane().add(start);
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String usernameInput = username.getText();
				char[] passwordInput = password.getPassword();
				database db = new database();
				db.charger();
				if (db.isExist(usernameInput, passwordInput)) {
					playerName = usernameInput;
					new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
					new playerChooseGUI();
					frame.dispose();
				} else {

					JOptionPane.showMessageDialog(frame, "Invalid username or password. Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}
				db.ClosingDB();
			}
		});
	}

	public void signup() {
		JLabel signupLabel1 = new JLabel("If you don't have an account.");
		signupLabel1.setBounds(80, 320, 250, 50);
		super.frame.getContentPane().add(signupLabel1);
		JLabel signupLabel2 = new JLabel("Please click on Sign Up");
		signupLabel2.setBounds(80, 340, 250, 50);
		super.frame.getContentPane().add(signupLabel2);

		JButton signupButton = new JButton("Sign Up");
		signupButton.setForeground(Color.BLACK);
		signupButton.setBackground(Color.LIGHT_GRAY);
		signupButton.setBounds(210, 380, 100, 20);
		super.frame.getContentPane().add(signupButton);
		signupButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new signupGUI();
			}

		});
	}

	public static String getPlayerName() {
		return playerName;
	}

}
