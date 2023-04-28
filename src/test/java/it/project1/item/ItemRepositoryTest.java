/*package it.project1.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {
    @Autowired
    private ItemRepository itemRepository;
    private Item testItem;


    @BeforeEach
    void setUp() {
        testItem = new Item(26, "Overpowered Sword", "A sharp weapon", 10, 5, "Legendary", 100, 100, true, "WEAPON", "Sword", 20);
    }

    @AfterEach
    void tearDown() {
        itemRepository.deleteById(26);
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
        itemRepositoryOld.addItem(testItem);
        testItem.setName("Updated Sword of the Hero");
        itemRepositoryOld.updateItem(testItem);
        Item updatedItem = itemRepositoryOld.getItemById(testItem.getId());
        assertNotNull(updatedItem);
        assertEquals(testItem.getName(), updatedItem.getName());
    }

    @Test
    void testGetItemById() {
        itemRepositoryOld.addItem(testItem);
        Item savedItem = itemRepositoryOld.getItemById(testItem.getId());
        assertNotNull(savedItem);
        assertEquals(testItem.getName(), savedItem.getName());
    }

    @Test
    void testGetAllItems() {
        List<Item> items = itemRepositoryOld.getAllItems();
        assertNotNull(items);
        assertEquals(25, items.size());
    }

    @Test
    void testDeleteItem() {
        itemRepositoryOld.addItem(testItem);
        itemRepositoryOld.deleteItem(testItem.getId());
        Item deletedItem = itemRepositoryOld.getItemById(testItem.getId());
        assertNull(deletedItem);
    }
}
*/