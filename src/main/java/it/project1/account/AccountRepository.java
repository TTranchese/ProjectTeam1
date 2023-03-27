package it.project1.account;

import java.sql.*;

public class AccountRepository {
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;

	public AccountRepository() {
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
			this.statement = connection.createStatement();
			this.resultSet = null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void createNewAccount(String nickName, String password) {
		if(!findAccount(nickName)){
			String createAccountQuery = "INSERT INTO mmo.accounts (nickName, password) VALUES ('" + nickName + "', '" + password + "');";
			try {
				this.statement.executeUpdate(createAccountQuery);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		} else System.out.println("Account already exists!");

	}

	public boolean findAccount(String nickName) {
		boolean returnBool = false;
		String query = "SELECT * FROM mmo.accounts WHERE nickName = '" + nickName + "'";
		try {
			this.resultSet = this.statement.executeQuery(query);
			while (resultSet.next()) {
				if ((resultSet.getString(2).equals(nickName))) {
					returnBool = true;
				}

			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return returnBool;
	}

	public void deleteAccount(int id) {
		String deleteQuery = "DELETE FROM mmo.accounts WHERE id=" + id;
		try {
			this.statement.executeUpdate(deleteQuery);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void updatePassword(int id, String newPassword) {
		String updatePasswordQuery = "UPDATE mmo.accounts SET password = '" + newPassword + "' WHERE id = " + id;
		try {
			statement.executeUpdate(updatePasswordQuery);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void updateUsername(int id, String nickName) {
		String updateNickNameQuery = "UPDATE mmo.accounts SET nickName = '" + nickName + "' WHERE id = " + id;
		try {
			statement.executeUpdate(updateNickNameQuery);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
