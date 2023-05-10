package it.project1.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Item saveOrUpdateItem(Item item) {
        return itemRepository.saveAndFlush(item);
    }

    public Optional<Item> getItemById(long id) {
        return itemRepository.findById(id);
    }

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void deleteItem(long id) {
        itemRepository.deleteById(id);
    }
}
