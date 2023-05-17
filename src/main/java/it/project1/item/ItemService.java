package it.project1.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemDTO saveOrUpdateItem(ItemDTO item) {
        return itemRepository.save(item);
    }

    public Optional<ItemDTO> getItemById(int id) {
        return itemRepository.findById(id);
    }

    public List<ItemDTO> getAllItems() {
        return itemRepository.findAll();
    }

    public void deleteItem(int id) {
        itemRepository.deleteById(id);
    }
}
