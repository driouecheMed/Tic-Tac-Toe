
/***********    THIS IS A CLASS THAT MANUPILATE THE DATABASE   ************/

package mainGame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {

	private Connection connection = null;
	private ResultSet resultSet = null;
	private Statement statement = null;

	public void charger() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tictactoe", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserer(Player p) {
		try {
			String sql = "insert into player(id,username,password,numberOfMatchPlayed,score) values(?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, p.getId());
			preparedStatement.setString(2, p.getUsername());
			preparedStatement.setString(3, new String(p.getPassword()));
			preparedStatement.setInt(4, p.getNumberOfMatches());
			preparedStatement.setInt(5, p.getScore());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	public int getMatchesPlayed(String playerName) {
		try {
			String sql = "select numberOfMatchPlayed from player where username = ? ";
			PreparedStatement PreparedStatement = connection.prepareStatement(sql); // connection
			PreparedStatement.setString(1, playerName); // fill the '?' with playerName
			resultSet = PreparedStatement.executeQuery(); // execute the SQL instruction
			while (resultSet.next()) {
				return resultSet.getInt("numberOfMatchPlayed");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}


	public void incMatchesPlayed(String playerName) {
		try {
			String sql = "update player set numberOfMatchPlayed= ? where username = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, getMatchesPlayed(playerName) + 1);
			preparedStatement.setString(2, playerName);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int getScore(String playerName) {
		try {
			String sql = "select score from player where username = ? ";
			PreparedStatement PreparedStatement = connection.prepareStatement(sql); // connection
			PreparedStatement.setString(1, playerName); // fill the '?' with playerName
			resultSet = PreparedStatement.executeQuery(); // execute the SQL instruction
			while (resultSet.next()) {
				return resultSet.getInt("score");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void incTieScore(String playerName) {
		try {
			String sql = "update player set score= ? where username = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, getScore(playerName) + 5);
			preparedStatement.setString(2, playerName);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void incWinScore(String playerName) {
		try {
			String sql = "update player set score= ? where username = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, getScore(playerName) + 10);
			preparedStatement.setString(2, playerName);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Boolean isExist(String playerUsername, char[] playerPassword) {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select username,password from player");
			String username, password;
			while (resultSet.next()) {
				username = resultSet.getString("username");
				password = resultSet.getString("password");
				if (playerUsername.equals(username) && String.copyValueOf(playerPassword).equals(password)) {
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Boolean doesntExist(String playerUsername, char[] playerPassword) {
		if (isExist(playerUsername, playerPassword))
			return false;
		else
			return true;
	}

	public void ClosingDB() {
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				/* ignored */}
		}
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				/* ignored */}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				/* ignored */}
		}
	}

}
