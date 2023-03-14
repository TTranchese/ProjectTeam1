package it.project1.items;

public class Armor extends Item implements IRequirments,ISellable {

    String type;
    int defense;
    int elementalDefense;

    public Armor(String name, String description, int value, double weight, String rarity, int requirments, boolean isStackable, int durability, String type, int defense, int elementalDefense) {
        super(name, description, value, weight, rarity, requirments, isStackable, durability);
        this.type = type;
        this.defense = defense;
        this.elementalDefense = elementalDefense;
    }


    @Override
    public void checkRequirments() {
        /* playerLevel not available yet in this class and has to be developed in depth
        if (requirments > playerLevel) {
            System.out.println("You don't meet the requirements to equip this armor.");
        } else {
            System.out.println("You can equip this armor.");
        }*/
    }

    @Override
    public boolean canSell() {
        if (isDamaged()) {
            System.out.println("You can't sell this armor, it's damaged.");
            return false;
        } else if (rarity.equals("common")) {
            System.out.println("You can't sell this armor, it's too common.");
            return false;
        } else {
            System.out.println("You can sell this armor.");
            return true;
        }
    }

    public boolean isDamaged(){
        return false;
    }

    public int repair(String getDurability){
        int maxDurability = 100;
        //has to return the maximum durability of the item when used.
        return maxDurability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getElementalDefense() {
        return elementalDefense;
    }

    public void setElementalDefense(int elementalDefense) {
        this.elementalDefense = elementalDefense;
    }
}
