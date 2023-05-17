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
    public ResponseEntity<List<ItemDTO>> getAllItems(){
        List<ItemDTO> itemList = itemService.getAllItems();
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getItemById(@PathVariable int id) {
        Optional<ItemDTO> item = itemService.getItemById(id);
        if(item.isPresent()) {
            return new ResponseEntity<>(item.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<ItemDTO> addItem(@RequestBody ItemDTO item){
        ItemDTO newItem = itemService.saveOrUpdateItem(item);
        return new ResponseEntity<>(newItem, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemDTO> updateItem(@PathVariable int id, @RequestParam ItemDTO item){
        Optional<ItemDTO> existingItem = itemService.getItemById(id);
        if (existingItem.isPresent()) {
            item.setId(id);
            ItemDTO updatedItem = itemService.saveOrUpdateItem(item);
            return new ResponseEntity<>(updatedItem, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteItemById(@PathVariable int id){
        Optional<ItemDTO> item = itemService.getItemById(id);
        if(item.isPresent()){
            itemService.deleteItem(id);
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
