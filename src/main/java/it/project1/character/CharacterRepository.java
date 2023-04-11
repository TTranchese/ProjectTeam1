package it.project1.character;

import java.sql.*;

public class CharacterRepository {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public CharacterRepository(){
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//TODO create all the CRUD functions
	public void createNewCharacter(int accountId){

	}
}
