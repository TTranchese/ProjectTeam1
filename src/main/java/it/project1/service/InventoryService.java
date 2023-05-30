package it.project1.service;

import it.project1.entities.Character;
import it.project1.repository.CharacterRepository;
import it.project1.entities.Inventory;
import it.project1.entities.Item;
import it.project1.repository.InventoryRepository;
import it.project1.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private CharacterRepository characterRepository;


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

    public void equipItem(int characterId, int itemIndex){
        Character character = characterRepository.findById(characterId)
                .orElseThrow(() -> new IllegalArgumentException("Character not found."));

        Inventory inventory = character.getInventory();

        List<Item> items = inventory.getItem();

        if(itemIndex < 0 || itemIndex >= items.size()){
            throw new IllegalArgumentException("Invalid item index.");
        }

        Item itemToEquip = items.get(itemIndex);

        if(itemToEquip.isEquipped()){
            throw new IllegalArgumentException("Item is already equipped.");
        }

        if(character.getC_level() <= itemToEquip.getRequirements()){
            throw new IllegalArgumentException("Character level is not sufficient to equip this item.");
        }

        if(itemToEquip.getDurability() < 20){
            throw new IllegalArgumentException("Item durability is less than 20.");
        }

        itemToEquip.setEquipped(true);
        itemRepository.saveAndFlush(itemToEquip);
    }


    public void unequipItem(int characterId, int itemIndex) {
        Character character = characterRepository.findById(characterId)
                .orElseThrow(() -> new IllegalArgumentException("Character not found."));

        Inventory inventory = character.getInventory();

        List<Item> items = inventory.getItem();

        if (itemIndex < 0 || itemIndex >= items.size()) {
            throw new IllegalArgumentException("Invalid item index.");
        }

        Item itemToUnequip = items.get(itemIndex);

        if (!itemToUnequip.isEquipped()) {
            throw new IllegalArgumentException("Item is not equipped.");
        }

        itemToUnequip.setEquipped(false);
        itemRepository.saveAndFlush(itemToUnequip);
    }
}
