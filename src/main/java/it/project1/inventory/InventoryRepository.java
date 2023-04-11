package it.project1.inventory;

import java.sql.*;

public class InventoryRepository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public InventoryRepository() {

        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addInventory(Inventory inventory) {
        String addInventoryQuery = "INSERT INTO mmo.inventory (idOwner, idItem, quantity, isEquipped)" +
                "VALUES (?, ?, ?, ?";
        try {
            preparedStatement = connection.prepareStatement(addInventoryQuery);

            preparedStatement.setInt(1, inventory.getIdOwner());
            preparedStatement.setInt(2, inventory.getIdItem());
            preparedStatement.setInt(3, inventory.getQuantity());
            preparedStatement.setBoolean(4, inventory.isEquipped());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateInventory(Inventory inventory){
        String updateInventoryQuery = "UPDATE mmo.inventory" +
                "SET idOwner = ?, idItem = ?, quantity = ?, isEquipped = ?" +
                "WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(updateInventoryQuery);

            preparedStatement.setInt(1, inventory.getIdOwner());
            preparedStatement.setInt(2, inventory.getIdItem());
            preparedStatement.setInt(3, inventory.getQuantity());
            preparedStatement.setBoolean(4, inventory.isEquipped());
            preparedStatement.setInt(5, inventory.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteInventory(int id){
        String deleteInventoryQuery = "DELETE FROM mmo.inventory WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(deleteInventoryQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Inventory getInventoryById(int id){
        String getInventoryQuery = "SELECT * FROM mmo.inventory WHERE id = ?";
        Inventory inventory = null;
        try {
            preparedStatement = connection.prepareStatement(getInventoryQuery);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                inventory = new Inventory(
                        resultSet.getInt("id"),
                        resultSet.getInt("idOwner"),
                        resultSet.getInt("idItem"),
                        resultSet.getInt("quantity"),
                        resultSet.getBoolean("isEquipped")
                        );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return inventory;
    }
}


