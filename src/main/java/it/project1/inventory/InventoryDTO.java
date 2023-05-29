package it.project1.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.project1.character.Character;
import it.project1.item.Item;
import it.project1.item.ItemDTO;

import java.util.List;

public class InventoryDTO {

    private long id;
    private Character character;
    private List<ItemDTO> item;
    private int weight;

    public InventoryDTO() {
    }

    public InventoryDTO(long id, Character character, List<ItemDTO> item, int weight) {
        this.id = id;
        this.character = character;
        this.item = item;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<ItemDTO> getItem() {
        return item;
    }

    public void setItem(List<ItemDTO> item) {
        this.item = item;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
