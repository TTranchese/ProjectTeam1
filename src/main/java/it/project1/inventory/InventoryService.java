package it.project1.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory saveOrUpdateInventory(Inventory inventory){
        return inventoryRepository.save(inventory);
    }

    public Optional<Inventory> getInventoryById(long id){
        return inventoryRepository.findById(id);
    }

    public List<Inventory> getAllInventory(){
        return inventoryRepository.findAll();
    }

    public void deleteInventory(long id){
        inventoryRepository.deleteById(id);
    }

}
