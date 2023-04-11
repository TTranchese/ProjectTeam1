package it.project1.inventory;

import it.project1.item.ItemRepository;

import  java.util.List;

public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository){
        this.inventoryRepository = inventoryRepository;
    }

    public void addInventory(Inventory inventory){
        inventoryRepository.addInventory(inventory);
    }

    public void updateInventory(Inventory inventory){
        inventoryRepository.updateInventory(inventory);
    }

    public void deleteInventory(int id){
        inventoryRepository.deleteInventory(id);
    }

    public Inventory getInventoryById(int id){
        return  inventoryRepository.getInventoryById(id);
    }

}
