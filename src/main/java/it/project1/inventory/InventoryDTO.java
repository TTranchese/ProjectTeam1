package it.project1.inventory;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.project1.character.CharacterEntity;
import it.project1.item.Item;

public class InventoryDTO {

    private long id;
    private CharacterEntity characterEntity;
    private Item item;
    private int slot;
    private int quantity;
    private boolean isEquipped;

    @JsonProperty(value = "isEquipped")
    public boolean isEquipped() {
        return isEquipped;
    }

    public InventoryDTO(long id, CharacterEntity characterEntity, Item item, int slot, int quantity, boolean isEquipped) {
        this.id = id;
        this.characterEntity = characterEntity;
        this.item = item;
        this.slot = slot;
        this.quantity = quantity;
        this.isEquipped = isEquipped;
    }

    public InventoryDTO(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CharacterEntity getCharacterEntity() {
        return characterEntity;
    }

    public void setCharacterEntity(CharacterEntity characterEntity) {
        this.characterEntity = characterEntity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}
