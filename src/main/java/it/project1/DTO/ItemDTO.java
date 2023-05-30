package it.project1.DTO;

import it.project1.enums.ItemSubtype;
import it.project1.enums.ItemType;

public class ItemDTO {

    private long id;
    private String name;
    private String description;
    private int value;
    private int weight;
    private String rarity;
    private int requirements;
    private int durability;
    private boolean isStackable;
    private int quantity;
    private boolean isEquipped;
    private ItemType type;
    private ItemSubtype subtype1;
    private int subtype2;

    public ItemDTO() {
    }

    public ItemDTO(long id, String name, String description, int value, int weight, String rarity, int requirements, int durability, boolean isStackable, int quantity, boolean isEquipped, ItemType type, ItemSubtype subtype1, int subtype2) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
        this.weight = weight;
        this.rarity = rarity;
        this.requirements = requirements;
        this.durability = durability;
        this.isStackable = isStackable;
        this.quantity = quantity;
        this.isEquipped = isEquipped;
        this.type = type;
        this.subtype1 = subtype1;
        this.subtype2 = subtype2;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getRequirements() {
        return requirements;
    }

    public void setRequirements(int requirements) {
        this.requirements = requirements;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public boolean isStackable() {
        return isStackable;
    }

    public void setStackable(boolean stackable) {
        isStackable = stackable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public ItemSubtype getSubtype1() {
        return subtype1;
    }

    public void setSubtype1(ItemSubtype subtype1) {
        this.subtype1 = subtype1;
    }

    public int getSubtype2() {
        return subtype2;
    }

    public void setSubtype2(int subtype2) {
        this.subtype2 = subtype2;
    }
}
