package it.project1.account;

import java.sql.*;

public class AccountRepository{
    public AccountRepository(){};

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
}
