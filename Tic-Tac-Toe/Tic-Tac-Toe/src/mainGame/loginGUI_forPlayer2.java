
/************    THIS IS A GUI FOR PLAYER 2 LOGIN   ************/
/************    AND HELP TO GET THE USERNAME OF PLAYER 2    ************/

package mainGame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class loginGUI_forPlayer2 extends loginGUI {

	private static String playerName2;

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
				if (db.isExist(usernameInput, passwordInput) && (!loginGUI.getPlayerName().equals(usernameInput))) {
					playerName2 = usernameInput;
					new player2InfoGUI(playerName2, 0, 201);
					new twoPlayerGUI();
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid username or password. Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}
				db.ClosingDB();
			}

		});
	}

	public static String getPlayer2Name() {
		return playerName2;
	}
}
