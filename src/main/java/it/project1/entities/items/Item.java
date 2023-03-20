package it.project1.entities.items;

public abstract class Item {

    String name;
    String description;
    int value;
    double weight;
    String rarity;
    int requirments;
    int durability;
    boolean isStackable;

    public Item(String name, String description, int value, double weight, String rarity, int requirments, boolean isStackable, int durability) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.weight = weight;
        this.rarity = rarity;
        this.requirments = requirments;
        this.isStackable = isStackable;
        this.durability = durability;
    }

    public void drop(){}

    public void pickUp(){}

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getRequirments() {
        return requirments;
    }

    public void setRequirments(int requirments) {
        this.requirments = requirments;
    }

    public boolean isStackable() {
        return isStackable;
    }

    public void setStackable(boolean stackable) {
        isStackable = stackable;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
