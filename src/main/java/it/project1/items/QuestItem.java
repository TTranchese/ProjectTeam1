package it.project1.items;

public class QuestItem extends Item implements IRequirments, ISellable{

    int questID;

    public QuestItem(String name, String description, int value, double weight, String rarity, int requirments, boolean isStackable,int durability, int questID) {
        super(name, description, value, weight, rarity, requirments, isStackable,durability);
        this.questID = questID;
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
        return false;
    }

    public int getQuestID() {
        return questID;
    }

    public void setQuestID(int questID) {
        this.questID = questID;
    }

}
