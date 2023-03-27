package it.project1.item;

import java.util.List;

public class ItemService {

    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void addItem(Item item) {
        itemRepository.addItem(item);
    }

    public void updateItem(Item item) {
        itemRepository.updateItem(item);
    }

    public Item getItemById(int id) {
        return itemRepository.getItemById(id);
    }

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public void deleteItem(int id) {
        itemRepository.deleteItem(id);
    }
}
