package it.project1.items;

public class Junk extends Item implements IUsable, ISellable{

    public Junk(String name, String description, int value, double weight, String rarity, int requirments, boolean isStackable, int durability) {
        super(name, description, value, weight, rarity, requirments, isStackable, durability);
    }

    @Override
    public boolean canSell() {
        return false;
    }

    @Override
    public boolean isUsable() {
        return false;
    }

    @Override
    public void consume() {

    }
}
