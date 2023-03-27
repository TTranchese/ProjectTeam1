package it.project1.item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public ItemRepository() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addItem(Item item) {
        if (doesItemExist(item.getId())) {
            System.out.println("Item with ID " + item.getId() + " already exists.");
            return;
        }
        String addItemQuery = "INSERT INTO mmo.items (id_character, id, name, description, value, weight," +
                "rarity, requirements, durability, is_stackable, type, subtype1, subtype2) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(addItemQuery);
            preparedStatement.setInt(1, item.getIdCharacter());
            preparedStatement.setInt(2, item.getId());
            preparedStatement.setString(3, item.getName());
            preparedStatement.setString(4, item.getDescription());
            preparedStatement.setInt(5, item.getValue());
            preparedStatement.setInt(6, item.getWeight());
            preparedStatement.setString(7, item.getRarity());
            preparedStatement.setInt(8, item.getRequirements());
            preparedStatement.setInt(9, item.getDurability());
            preparedStatement.setBoolean(10, item.isStackable());
            preparedStatement.setString(11, item.getType().name());
            preparedStatement.setString(12, item.getSubtype1());
            preparedStatement.setString(13, item.getSubtype2());
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            throw new RuntimeException("Item with ID " + item.getId() + " already exists.", e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateItem(Item item) {
        String updateItemQuery = "UPDATE mmo.items " +
                "SET name = ?, description = ?, value = ?, weight = ?, rarity = ?, requirements = ?, durability = ?, " +
                "is_stackable = ?, type = ?, subtype1 = ?, subtype2 = ? " +
                "WHERE id = ?";
        if (!doesItemExist(item.getId())) {
            System.out.println("Item with ID " + item.getId() + " does not exist.");
            return;
        }
        try {
            preparedStatement = connection.prepareStatement(updateItemQuery);
            preparedStatement.setString(1, item.getName());
            preparedStatement.setString(2, item.getDescription());
            preparedStatement.setInt(3, item.getValue());
            preparedStatement.setInt(4, item.getWeight());
            preparedStatement.setString(5, item.getRarity());
            preparedStatement.setInt(6, item.getRequirements());
            preparedStatement.setInt(7, item.getDurability());
            preparedStatement.setBoolean(8, item.isStackable());
            preparedStatement.setString(9, item.getType().name());
            preparedStatement.setString(10, item.getSubtype1());
            preparedStatement.setString(11, item.getSubtype2());
            preparedStatement.setInt(12, item.getId());
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            throw new RuntimeException("Item with ID " + item.getId() + " does not exist.", e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Item with ID " + item.getId() + " updated.");
    }

    public Item getItemById(int id) {
        Item item = null;
        String getItemQuery = "SELECT * FROM items WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(getItemQuery);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                item = new Item(
                        resultSet.getInt("idCharacter"),
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getInt("value"),
                        resultSet.getInt("weight"),
                        resultSet.getString("rarity"),
                        resultSet.getInt("requirments"),
                        resultSet.getInt("durability"),
                        resultSet.getBoolean("isStackable"),
                        Item.ItemType.valueOf(resultSet.getString("type")),
                        resultSet.getString("subtype1"),
                        resultSet.getString("subtype2")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return item;
    }

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        String getAllItemsQuery = "SELECT * FROM items";
        try {
            preparedStatement = connection.prepareStatement(getAllItemsQuery);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Item item = new Item(
                        resultSet.getInt("id_character"),
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("description"),
                        resultSet.getInt("value"),
                        resultSet.getInt("weight"),
                        resultSet.getString("rarity"),
                        resultSet.getInt("requirements"),
                        resultSet.getInt("durability"),
                        resultSet.getBoolean("is_stackable"),
                        Item.ItemType.valueOf(resultSet.getString("type")),
                        resultSet.getString("subtype1"),
                        resultSet.getString("subtype2")
                );
                items.add(item);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return items;
    }

    public void deleteItem(int id) {
        if (!doesItemExist(id)) {
            System.out.println("Item with ID " + id + " does not exist.");
            return;
        }
        String deleteItemQuery = "DELETE FROM mmo.items WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(deleteItemQuery);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            throw new RuntimeException("Item with ID " + id + " does not exist.", e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Item with ID " + id + " deleted.");
    }

    private boolean doesItemExist(int itemId) {
        String selectQuery = "SELECT id FROM mmo.items WHERE id = ?";
        try {
            preparedStatement = connection.prepareStatement(selectQuery);
            preparedStatement.setInt(1, itemId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

