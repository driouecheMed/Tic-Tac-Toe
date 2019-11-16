
/********  THIS IS A CLASS THAT CONTAIN THE MAIN ALGORITMICS OF THE GAME  **********/
  /****************    like: isWin() , isTie() , isEmpty()   ********************/

package mainGame;

public class gameRule {
	
	private final int numberOfRow = 3;
	private State[][] table = new State[numberOfRow][numberOfRow];
	
	public gameRule() {
		init();
	}
	
	public State getState(int horizontalIndex, int verticalIndex) {
		return table[horizontalIndex][verticalIndex];
	}

	public void setState(State newState, int horizontalIndex, int verticalIndex) {
		this.table[horizontalIndex][verticalIndex] = newState;
	}

	public void init() {
		for (int horizontalIndex = 0; horizontalIndex < numberOfRow; horizontalIndex++) {
			for (int verticalIndex = 0; verticalIndex < numberOfRow; verticalIndex++) {
				table[horizontalIndex][verticalIndex] = State.empty;
			}
		}
	}

	public Boolean isTie() {
		for (int horizontalIndex = 0; horizontalIndex < numberOfRow; horizontalIndex++) {
			for (int verticalIndex = 0; verticalIndex < numberOfRow; verticalIndex++) {
				if (isEmpty(table[horizontalIndex][verticalIndex])) {
					return false;
				}
			}
		}
		return true;
	}

	public Boolean isEmpty(State s) {
		if (s.equals(State.empty)) {
			return true;
		} else {
			return false;
		}
	}

	public String currentPlayer(State s) {
		if (s.equals(State.X)) {
			if (loginGUI.getPlayerName() == null)
				return "Player 1 ";
			else
				return loginGUI.getPlayerName();
		} else {
			if (loginGUI_forPlayer2.getPlayerName() == null)
				return "Player 2 ";
			else
				return loginGUI_forPlayer2.getPlayer2Name();
		}
	}

	public Boolean isHorizontalWin() {
		Boolean temp = true;
		for (int horizontalIndex = 0; horizontalIndex < numberOfRow; horizontalIndex++) {
			temp = true;
			for (int verticalIndex = 0; verticalIndex < (numberOfRow - 1); verticalIndex++) {
				if (isEmpty(table[horizontalIndex][verticalIndex])) {
					temp = false;
					break;
				} else if (!table[horizontalIndex][verticalIndex].equals(table[horizontalIndex][verticalIndex + 1])) {
					temp = false;
				}

			}
			if (temp) {
				return true;
			}
		}
		return false;
	}

	public Boolean isVerticalWin() {
		Boolean temp;
		for (int verticalIndex = 0; verticalIndex < numberOfRow; verticalIndex++) {
			temp = true;
			for (int horizontalIndex = 0; horizontalIndex < (numberOfRow - 1); horizontalIndex++) {
				if (isEmpty(table[horizontalIndex][verticalIndex])) {
					temp = false;
					break;
				} else if (!table[horizontalIndex][verticalIndex].equals(table[horizontalIndex + 1][verticalIndex])) {
					temp = false;
				}
			}
			if (temp) {
				return true;
			}
		}
		return false;
	}

	public Boolean isDiagonalWin() {
		// the first two conditions to see if diagonal elements are equal
		// the third condition is to check that the diagonal is not empty
		if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2]) && (!isEmpty(table[0][0]))) {
			return true;
		} else if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0]) && (!isEmpty(table[2][0]))) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean isWin() {
		return isHorizontalWin() || isVerticalWin() || isDiagonalWin();
	}
}
