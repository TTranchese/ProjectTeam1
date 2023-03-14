package it.project1.items;

public class Consumables extends  Item implements IUsable{
    String effect;
    int duration;
    int cooldown;

    public Consumables(String name, String description, int value, int weight, String rarity, int requirments, boolean isStackable, int durability, String effect, int duration, int cooldown) {
        super(name, description, value, weight, rarity, requirments, isStackable, durability);
        this.effect = effect;
        this.duration = duration;
        this.cooldown = cooldown;
    }

    @Override
    public boolean isUsable() {
        return false;
    }

    @Override
    public void consume() {

    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }
}
