package mainGame;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainContent extends window {

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
	private State currentState = State.X;
//	private String s ="";
	private gameRule model = new gameRule();
	JLabel label = new JLabel("player 1 Turn");

	public mainContent() {
		// Background Setting
		try {
			JLabel label = new JLabel(new ImageIcon(
					ImageIO.read(new File("..\\images\\background.png"))));
			frame.setContentPane(label);
		} catch (IOException e) {
			System.out.println("Image doesn't exist...");
		}
		titleGame();
		copyright();
		player1Round();
		button();
		super.frame.setVisible(true);
	}

	public void titleGame() {
		JLabel title = new JLabel("Player 1 vs Player 2");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial", Font.PLAIN, 40));
		title.setBounds(25, 5, 400, 100);
		super.frame.getContentPane().add(title);
	}

	public void copyright() {
		JLabel title = new JLabel("Copyright © 2019 Developer DRIOUECHE Mohammed");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Arial", Font.PLAIN, 10));
		title.setBounds(130, 490, 300, 50);
		super.frame.getContentPane().add(title);
	}

	public void player1Round() {
		label.setText("player 1 Turn");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(65, 75, 400, 100);
		super.frame.getContentPane().add(label);
	}

	public void player2Round() {
		label.setText("player 2 Turn");

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
				// tictactoeCustomButton b = (tictactoeCustomButton)e.getSource();
				e.getSource();
				if (model.isEmpty(model.getState(0, 0))) {
					button00.setState(currentState);
					model.setState(currentState, 0, 0);
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}

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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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
					if (model.isWin()) {
						JOptionPane.showMessageDialog(frame, model.currentPlayer(currentState) + " has won the game.",
								"Message", JOptionPane.INFORMATION_MESSAGE);
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
					switchState();
					if (currentState.equals(State.X)) {
						player1Round();
					} else {
						player2Round();
					}
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

}
