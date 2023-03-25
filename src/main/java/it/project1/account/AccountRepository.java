package it.project1.account;

import java.sql.*;

public class AccountRepository{
    public AccountRepository(){};
    public void createNewAccount(String nickName, String password){
        Connection connection = null;
        Statement statement = null;
        String createAccountQuery = "INSERT INTO mmo.accounts (nickName, password) VALUES ('"+nickName+"', '"+password+"');";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
            statement=connection.createStatement();
            statement.executeUpdate(createAccountQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean findAccount(Account account) {
        Connection connection;
        Statement stm = null;
        ResultSet resultSet = null;
        boolean returnBool = false;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
            stm = connection.createStatement();
            String query = "SELECT * FROM mmo.accounts WHERE nickName = '" + account.getName() + "' AND password = '" + account.getPassword() + "'";
            resultSet = stm.executeQuery(query);
            while (resultSet.next()) {
                if ((resultSet.getInt(1) == account.getId()) && (resultSet.getString(2).equals(account.getName())) && (resultSet.getString(3).equals(account.getPassword()))) {
                    returnBool = true;
                }

            }
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        return returnBool;
    }

    public void deleteAccount(int id){
        Connection connection = null;
        Statement statement = null;
        String deleteQuery = "DELETE FROM mmo.accounts WHERE id="+id;
        try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
             statement=connection.createStatement();
             statement.executeUpdate(deleteQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updatePassword(int id, String newPassword){
        Connection connection = null;
        Statement statement = null;
        String updatePasswordQuery = "UPDATE mmo.accounts SET password = '"+newPassword+"' WHERE id = "+id;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
            statement=connection.createStatement();
            statement.executeUpdate(updatePasswordQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

     public void updateUsername(int id, String nickName){
         Connection connection = null;
         Statement statement = null;
         String updateNickNameQuery = "UPDATE mmo.accounts SET nickName = '"+nickName+"' WHERE id = "+id;
         try {
             connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
             statement=connection.createStatement();
             statement.executeUpdate(updateNickNameQuery);
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
}
