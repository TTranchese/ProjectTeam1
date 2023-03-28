package it.project1.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {

    private ItemRepository itemRepository;
    private Item testItem;
    private Connection connection;

    public ItemRepositoryTest() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeEach
    void setUp() {
        itemRepository = new ItemRepository();
        testItem = new Item(26, "Overpowered Sword", "A sharp weapon", 10, 5, "Legendary", 100, 100, true, Item.ItemType.WEAPON, "20", "Sword");
    }

    @AfterEach
    void tearDown() {
        itemRepository.deleteItem(26);
    }

    @Test
    void testAddItem() {
        itemRepository.addItem(testItem);
        Item savedItem = itemRepository.getItemById(testItem.getId());
        assertNotNull(savedItem);
        assertEquals(testItem.getName(), savedItem.getName());
    }

    @Test
    void testUpdateItem() {
        itemRepository.addItem(testItem);
        testItem.setName("Updated Sword of the Hero");
        itemRepository.updateItem(testItem);
        Item updatedItem = itemRepository.getItemById(testItem.getId());
        assertNotNull(updatedItem);
        assertEquals(testItem.getName(), updatedItem.getName());
    }

    @Test
    void testGetItemById() {
        itemRepository.addItem(testItem);
        Item savedItem = itemRepository.getItemById(testItem.getId());
        assertNotNull(savedItem);
        assertEquals(testItem.getName(), savedItem.getName());
    }

    @Test
    void testGetAllItems() {
        List<Item> items = itemRepository.getAllItems();
        assertNotNull(items);
        assertEquals(25, items.size());
    }

    @Test
    void testDeleteItem() {
        itemRepository.addItem(testItem);
        itemRepository.deleteItem(testItem.getId());
        Item deletedItem = itemRepository.getItemById(testItem.getId());
        assertNull(deletedItem);
    }
}
