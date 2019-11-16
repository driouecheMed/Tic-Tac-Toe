
/********  THIS IS THE MAIN GUI FOR PLAYING AGAINST A PLAYER NEXT TO HIM *********/
					/*******  THIS IS NOT ONLINE OPTION *******/

package mainGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class twoPlayerGUI extends mainGameGUI{
	
	public twoPlayerGUI() {
		titleGame();
		nameOfPlayerRound(); 		// to initialize the label of turn
		button();
		
	}
	
	public void titleGame() {
		JLabel title = new JLabel(loginGUI.getPlayerName() + " vs " + loginGUI_forPlayer2.getPlayer2Name());
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial", Font.PLAIN, 40));
		title.setBounds(25, 5, 400, 100);
		super.frame.getContentPane().add(title);
	}
	
	public void nameOfPlayerRound() {
		label.setText(model.currentPlayer(currentState) + " Turn");
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

		/*
		 * button[0][0].setBounds(5, 160, 115, 100);
		 * super.frame.getContentPane().add(button[0][0]);
		 * button[0][0].addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { e.getSource(); if
		 * (model.isEmpty(model.getState(0, 0))) { button00.setState(currentState);
		 * model.setState(currentState, 0, 0); dialog(); switchState();
		 * nameOfPlayerRound();
		 * 
		 * } else { JOptionPane.showMessageDialog(frame, "Invalid move.", "Message",
		 * JOptionPane.INFORMATION_MESSAGE); } } });
		 */
		
		button00.setBounds(5, 160, 115, 100);
		super.frame.getContentPane().add(button00);
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				e.getSource();
				if (model.isEmpty(model.getState(0, 0))) {
					button00.setState(currentState);
					model.setState(currentState, 0, 0);
					dialog();
					switchState();
					nameOfPlayerRound();

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
					button01.setState(currentState);
					model.setState(currentState, 0, 1);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button02.setState(currentState);
					model.setState(currentState, 0, 2);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button10.setState(currentState);
					model.setState(currentState, 1, 0);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button11.setState(currentState);
					model.setState(currentState, 1, 1);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button12.setState(currentState);
					model.setState(currentState, 1, 2);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button20.setState(currentState);
					model.setState(currentState, 2, 0);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button21.setState(currentState);
					model.setState(currentState, 2, 1);
					dialog();
					switchState();
					nameOfPlayerRound();
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
					button22.setState(currentState);
					model.setState(currentState, 2, 2);
					dialog();
					switchState();
					nameOfPlayerRound();
				} else {
					JOptionPane.showMessageDialog(frame, "Invalid move.", "Message", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}

	public void switchState() {
		if (currentState.equals(State.X)) {
			currentState = State.O;
		} else {
			currentState = State.X;
		}
	}
	
	public void dialog() {
		if (model.isWin()) {
			//update database
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.incMatchesPlayed(loginGUI_forPlayer2.getPlayer2Name());
			if(model.currentPlayer(currentState).equals(loginGUI.getPlayerName())) {
				db.incWinScore(loginGUI.getPlayerName());
			}else if(model.currentPlayer(currentState).equals(loginGUI_forPlayer2.getPlayer2Name())) {
				db.incWinScore(loginGUI_forPlayer2.getPlayer2Name());
			}
			db.ClosingDB();
			//update player information frame
			playerInfoGUI.close();
			player2InfoGUI.close();
			new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
			new player2InfoGUI(loginGUI_forPlayer2.getPlayer2Name(), 0, 201);
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
			//update database
			database db = new database();
			db.charger();
			db.incMatchesPlayed(loginGUI.getPlayerName());
			db.incMatchesPlayed(loginGUI_forPlayer2.getPlayer2Name());
			db.incTieScore(loginGUI.getPlayerName());
			db.incTieScore(loginGUI_forPlayer2.getPlayer2Name());
			db.ClosingDB();
			//update player information frame
			playerInfoGUI.close();
			player2InfoGUI.close();
			new playerInfoGUI(loginGUI.getPlayerName(), 0, 0);
			new player2InfoGUI(loginGUI_forPlayer2.getPlayer2Name(), 0, 201);
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
