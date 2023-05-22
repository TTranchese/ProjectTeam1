package it.project1.inventory;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;


    @GetMapping("/all")
    public ResponseEntity<List<Inventory>> getAllInventory(){
        List<Inventory> inventoryList = inventoryService.getAllInventory();
        return new ResponseEntity<>(inventoryList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inventory> getInventoryById(@PathVariable long id){
        Optional<Inventory> inventory = inventoryService.getInventoryById(id);
        if(inventory.isPresent()){
            return new ResponseEntity<>(inventory.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Inventory> addInventory(@RequestBody Inventory inventory){
        Inventory newInventory = inventoryService.saveOrUpdateInventory(inventory);
        return new ResponseEntity<>(newInventory, HttpStatus.CREATED);
    }

    @PutMapping("(update/{id}")
    public ResponseEntity<Inventory> updateInventory(@PathVariable long id, @RequestParam Inventory inventory){
        Optional<Inventory> existingInventory = inventoryService.getInventoryById(id);
        if(existingInventory.isPresent()){
            inventory.setId(id);
            Inventory updateInventory = inventoryService.saveOrUpdateInventory(inventory);
            return new ResponseEntity<>(updateInventory, HttpStatus.OK);
            }else{
            return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteInventoryById(@PathVariable long id){
        Optional<Inventory> inventory = inventoryService.getInventoryById(id);
        if(inventory.isPresent()){
            inventoryService.deleteInventory(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/equip/{characterId}/{itemIndex}")
    public ResponseEntity<String> equipItem(@PathVariable int characterId, @PathVariable int itemIndex){
        try{
            inventoryService.equipItem(characterId, itemIndex);
            return ResponseEntity.ok("Item equipped successfully.");
        }catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/unequip/{characterId}/{itemIndex}")
    public ResponseEntity<String> unequipItem(@PathVariable int characterId, @PathVariable int itemIndex){
        try{
            inventoryService.unequipItem(characterId, itemIndex);
            return ResponseEntity.ok("Item unequipped successfully.");
        }catch (IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

