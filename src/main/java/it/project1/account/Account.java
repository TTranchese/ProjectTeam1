package it.project1.account;


import java.sql.*;

public class Account implements IAccountRepository{
	private int id;
	private String name;
	private String password;

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
	public boolean findAccount() {
		Connection connection;
		Statement stm = null;
		ResultSet resultSet = null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
				stm = connection.createStatement();
				String query = "SELECT * FROM mmo.accounts WHERE nickName = '"+this.name+"' AND password = '"+this.password+"'";
				resultSet = stm.executeQuery(query);

				if ((resultSet.getInt(1)==this.id) && (resultSet.getString(2).equals(this.name))&&(resultSet.getString(3).equals(this.password))){
					resultSet.close();
					stm.close();
					return true;
				} else{
					resultSet.close();
					stm.close();
					return false;
				}
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
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
