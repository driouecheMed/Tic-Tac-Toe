
/********  THIS IS THE MAIN GUI FOR PLAYING AGAINST COMPUTER *********/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class computerBrainGUI extends mainGameGUI {

	public computerBrainGUI() {
		titleGame();
		nameOfPlayerRound();
		button();
	}

	public void titleGame() {
		JLabel title = new JLabel(loginGUI.getPlayerName() + " vs Computer");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial", Font.PLAIN, 40));
		title.setBounds(25, 5, 400, 100);
		super.frame.getContentPane().add(title);
	}

	public void nameOfPlayerRound() {
		label.setText(loginGUI.getPlayerName() + " Turn");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(65, 75, 400, 100);
		super.frame.getContentPane().add(label);
	}

	/*
	 * The EventObject contains the getSource( ) method. Suppose you have many
	 * buttons in your application. So, you can find which button is cliked by,
	 * using the getSource() method. The getSource() method returns the source of
	 * the event.
	 */
	public void button() {

		button00.setBounds(5, 160, 115, 100);
		super.frame.getContentPane().add(button00);
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(0, 0))) {
					button00.setState(State.X);
					model.setState(State.X, 0, 0);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button01.setBounds(138, 160, 115, 100);
		super.frame.getContentPane().add(button01);
		button01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(0, 1))) {
					button01.setState(State.X);
					model.setState(State.X, 0, 1);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button02.setBounds(270, 160, 115, 100);
		super.frame.getContentPane().add(button02);
		button02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(0, 2))) {
					button02.setState(State.X);
					model.setState(State.X, 0, 2);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button10.setBounds(5, 279, 115, 115);
		super.frame.getContentPane().add(button10);
		button10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(1, 0))) {
					button10.setState(State.X);
					model.setState(State.X, 1, 0);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button11.setBounds(138, 279, 115, 115);
		super.frame.getContentPane().add(button11);
		button11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(1, 1))) {
					button11.setState(State.X);
					model.setState(State.X, 1, 1);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button12.setBounds(270, 279, 115, 115);
		super.frame.getContentPane().add(button12);
		button12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(1, 2))) {
					button12.setState(State.X);
					model.setState(State.X, 1, 2);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button20.setBounds(5, 410, 115, 100);
		super.frame.getContentPane().add(button20);
		button20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(2, 0))) {
					button20.setState(State.X);
					model.setState(State.X, 2, 0);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button21.setBounds(138, 410, 115, 100);
		super.frame.getContentPane().add(button21);
		button21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(2, 1))) {
					button21.setState(State.X);
					model.setState(State.X, 2, 1);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie when player end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		button22.setBounds(270, 410, 115, 100);
		super.frame.getContentPane().add(button22);
		button22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(2, 2))) {
					button22.setState(State.X);
					model.setState(State.X, 2, 2);
					dialog(); // this dialog is in case the game is tie when player end turn
					// Or player click on a full button
					brain();
					dialogComputer(); // this dialog is in case the game is tie or win when Computer end turn
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}

	// this is the algorithm that I implement to the computer
	public void brain() {
		if (!model.isTie()) {
			Boolean didntFind = true;
			while (didntFind) {
				Random rand = new Random();
				int n = (rand.nextInt(9) + 1);
				switch (n) {
				case 1:
					if (model.isEmpty(model.getState(0, 0))) {
						button00.setState(State.O);
						didntFind = false;
					}
					break;
				case 2:
					if (model.isEmpty(model.getState(0, 1))) {
						button01.setState(State.O);
						didntFind = false;
					}
					break;
				case 3:
					if (model.isEmpty(model.getState(0, 2))) {
						button02.setState(State.O);
						didntFind = false;
					}
					break;
				case 4:
					if (model.isEmpty(model.getState(1, 0))) {
						button10.setState(State.O);
						didntFind = false;
					}
					break;
				case 5:
					if (model.isEmpty(model.getState(1, 1))) {
						button11.setState(State.O);
						didntFind = false;
					}
					break;
				case 6:
					if (model.isEmpty(model.getState(1, 2))) {
						button12.setState(State.O);
						didntFind = false;
					}
					break;

				case 7:
					if (model.isEmpty(model.getState(2, 0))) {
						button20.setState(State.O);
						didntFind = false;
					}
					break;
				case 8:
					if (model.isEmpty(model.getState(2, 1))) {
						button21.setState(State.O);
						didntFind = false;
					}
					break;
				case 9:
					if (model.isEmpty(model.getState(2, 2))) {
						button22.setState(State.O);
						didntFind = false;
					}
					break;
				default:
					didntFind = true;
				}
			}
		}
	}

	public void dialog() {
		if (model.isWin()) {
			//Update database
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.incWinScore(loginGUI.getPlayerName());
			db.ClosingDB();
			//update player information frame
			playerInfoGUI.close();
			new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
			//dialog
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
			//Update database
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.incTieScore(loginGUI.getPlayerName());
			db.ClosingDB();
			//update player information frame
			playerInfoGUI.close();
			new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
			//dialog
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
	
	public void dialogComputer() {
		if (model.isWin()) {
			//Update database
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.ClosingDB();
			//update player information frame
			playerInfoGUI.close();
			new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
			//dialog
			JOptionPane.showMessageDialog(frame, "Computer has won the game.", "Message",
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
			//Update database
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.incTieScore(loginGUI.getPlayerName());
			db.ClosingDB();
			//update player information frame
			playerInfoGUI.close();
			new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
			//dialog
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

}
