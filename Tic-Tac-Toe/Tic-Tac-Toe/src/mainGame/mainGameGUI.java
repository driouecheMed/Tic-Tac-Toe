
/********  THIS IS THE MAIN GUI FOR PLAYING TIC TAC TOE W/ FRIEND *********/

package mainGame;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class mainGameGUI extends window {

	// protected tictactoeCustomButton [][] button = new
	// tictactoeCustomButton[3][3];
	protected tictactoeCustomButton button00 = new tictactoeCustomButton();
	protected tictactoeCustomButton button01 = new tictactoeCustomButton();
	protected tictactoeCustomButton button02 = new tictactoeCustomButton();
	protected tictactoeCustomButton button10 = new tictactoeCustomButton();
	protected tictactoeCustomButton button11 = new tictactoeCustomButton();
	protected tictactoeCustomButton button12 = new tictactoeCustomButton();
	protected tictactoeCustomButton button20 = new tictactoeCustomButton();
	protected tictactoeCustomButton button21 = new tictactoeCustomButton();
	protected tictactoeCustomButton button22 = new tictactoeCustomButton();
	protected State currentState = State.X;
	protected gameRule model = new gameRule();
	JLabel label = new JLabel("player 1 Turn");

	public mainGameGUI() {
		// Background Setting
		try {
			JLabel label = new JLabel(new ImageIcon(ImageIO.read(new File("..\\images\\background.png"))));
			frame.setContentPane(label);
		} catch (IOException e) {
			System.out.println("Image doesn't exist...");
		}
		
		copyright();
		
		super.frame.setVisible(true);
	}

	public void copyright() {
		JLabel CR = new JLabel("Copyright © 2019 Developer DRIOUECHE Mohammed");
		CR.setForeground(Color.WHITE);
		CR.setFont(new Font("Arial", Font.PLAIN, 10));
		CR.setBounds(130, 490, 300, 50);
		frame.getContentPane().add(CR);
	}

	public void boardInit() {
		button00.setText("");
		button01.setText("");
		button02.setText("");
		button10.setText("");
		button11.setText("");
		button12.setText("");
		button20.setText("");
		button21.setText("");
		button22.setText("");
	}

/*	public void dialog() {
		if (model.isWin()) {
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.ClosingDB();
			JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.", "Message",
					JOptionPane.INFORMATION_MESSAGE);
			int result = JOptionPane.showConfirmDialog(frame, "Do you want to play again?", "Again?",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == 0) { // Yes
				model.init();
				boardInit();
			} else if (result == 1) { // No
				frame.setVisible(false);
				System.exit(0);
			}
		} else if (model.isTie()) {
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.ClosingDB();
			JOptionPane.showMessageDialog(frame, "Tie game.", "Message", JOptionPane.INFORMATION_MESSAGE);
			int result = JOptionPane.showConfirmDialog(frame, "Do you want to play again?", "Again?",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if (result == 0) { // Yes
				model.init();
				boardInit();
			} else if (result == 1) { // No
				frame.setVisible(false);
				System.exit(0);
			}
		}
	}
*/
}