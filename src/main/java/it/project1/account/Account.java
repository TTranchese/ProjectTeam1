package it.project1.account;


import java.sql.*;

public class Account implements IAccountRepository{
	private int id;
	private String name;
	private String password;
	//connetto al database
	Connection connection;
	{
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public Account() {}

	public Account(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public Account findAccount() {
		Statement stm = null;
		ResultSet resultSet = null;
		Account returnAccount = null;
		try {
			stm = connection.createStatement();
			String query = "SELECT name, password FROM mmo.accounts WHERE name = "+this.name+" AND password = "+this.password;
			resultSet = stm.executeQuery(query);
			returnAccount = new Account(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3) );
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return returnAccount;
	}

	@Override
	public void insertAccount() {

	}

	@Override
	public void deleteAccount() {

	}

	@Override
	public void updateAccountName() {

	}

	@Override
	public void updateAccountPassword() {

	}
}
