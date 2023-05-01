package it.project1.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public ResponseEntity<List<Item>> getAllItems(){
        List<Item> itemList = itemService.getAllItems();
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable int id) {
        Optional<Item> item = itemService.getItemById(id);
        if(item.isPresent()) {
            return new ResponseEntity<>(item.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Item> addItem(@RequestParam Item item){
        Item newItem = itemService.saveOrUpdateItem(item);
        return new ResponseEntity<>(newItem, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateitem(@PathVariable int id, @RequestParam Item item){
        Optional<Item> existingItem = itemService.getItemById(id);
        if (existingItem.isPresent()) {
            item.setId(id);
            Item updatedItem = itemService.saveOrUpdateItem(item);
            return new ResponseEntity<>(updatedItem, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteItemById(@PathVariable int id){
        Optional<Item> item = itemService.getItemById(id);
        if(item.isPresent()){
            itemService.deleteItem(id);
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
