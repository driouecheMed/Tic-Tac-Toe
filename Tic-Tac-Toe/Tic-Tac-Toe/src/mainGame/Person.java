
/*****  THIS IS A BASIC CLASS OF PERSON {WHO CAN BE A PLAYER}  ****/

package mainGame;

public class Person {
	
	private String username;
	private char[] password;

	public Person(String username, char[] password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

}
