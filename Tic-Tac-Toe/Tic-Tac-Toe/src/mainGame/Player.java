
/****  THIS IS THE MAIN PLAYER INFORMATION CLASS  ****/

package mainGame;

public class Player extends Person {

	private static int count = 4;
	private final int id;
	private int score = 0;
	private int numberOfMatches = 0;

	public Player(String username, char[] password) {
		super(username, password);
		count++;
		id = count;
		this.score = 0;
		this.numberOfMatches = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getId() {
		return id;
	}

}
