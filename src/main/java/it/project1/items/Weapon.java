package it.project1.items;

public class Weapon extends  Item implements IRequirments, ISellable{

    String type;
    int damage;
    int range;
    int attackSpeed;
    int criticalChance;

    public Weapon(String name, String description, int value, double weight, String rarity, int requirments, boolean isStackable, int durability, String type, int damage, int range, int attackSpeed, int criticalChance) {
        super(name, description, value, weight, rarity, requirments, isStackable,durability);
        this.type = type;
        this.damage = damage;
        this.range = range;
        this.attackSpeed = attackSpeed;
        this.criticalChance = criticalChance;
    }

    @Override
    public boolean canSell() {
        if (isDamaged()) {
            System.out.println("You can't sell this weapon, it's damaged.");
            return false;
        } else if (rarity.equals("common")) {
            System.out.println("You can't sell this weapon, it's too common.");
            return false;
        } else {
            System.out.println("You can sell this weapon.");
            return true;
        }
    }

    @Override
    public void checkRequirments() {
        /* playerLevel not available yet in this class and has to be developed in depth
        if (requirments > playerLevel) {
            System.out.println("You don't meet the requirements to equip this Weapon.");
        } else {
            System.out.println("You can equip this Weapon.");
        }*/
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

}
