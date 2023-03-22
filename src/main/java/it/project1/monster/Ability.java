package it.project1.monster;

public interface Ability {
    String getName();
    String getDescription();
    int getAbilityCost();
    int getTimer();
    Element getElement();
    void applyEffect(Monster monster);
}