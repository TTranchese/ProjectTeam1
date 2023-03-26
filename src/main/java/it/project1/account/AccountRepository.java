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
		//TODO aggiungere check se il nickname esiste già
		String createAccountQuery = "INSERT INTO mmo.accounts (nickName, password) VALUES ('" + nickName + "', '" + password + "');";
		try {
			this.statement.executeUpdate(createAccountQuery);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean findAccount(Account account) {
		boolean returnBool = false;
		String query = "SELECT * FROM mmo.accounts WHERE nickName = '" + account.getName() + "' AND password = '" + account.getPassword() + "'";
		try {
			this.resultSet = this.statement.executeQuery(query);
			while (resultSet.next()) {
				if ((resultSet.getInt(1) == account.getId()) && (resultSet.getString(2).equals(account.getName())) && (resultSet.getString(3).equals(account.getPassword()))) {
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
