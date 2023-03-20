package it.project1.entities.monster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoveSet {
    private List<Ability> abilities;
    private List<Integer> order;

    public MoveSet() {
        abilities = new ArrayList<>();
        order = new ArrayList<>();
    }

    public void addAbility(Ability ability) {
        abilities.add(ability);
        order.add(abilities.size() - 1);
    }

    public void addAbilityAt(Ability ability, int index) {
        abilities.add(index, ability);
        updateOrder(index);
    }

    private void updateOrder(int index) {
        for (int i = 0; i < order.size(); i++) {
            if (order.get(i) >= index) {
                order.set(i, order.get(i) + 1);
            }
        }
        order.add(index);
    }

    public void removeAbility(int index) {
        abilities.remove(index);
        updateOrderRemove(index);
    }

    private void updateOrderRemove(int index) {
        for (int i = 0; i < order.size(); i++) {
            if (order.get(i) == index) {
                order.remove(i);
            }
            if (order.get(i) > index) {
                order.set(i, order.get(i) - 1);
            }
        }
    }

    public void swapAbility(int index1, int index2) {
        Collections.swap(order, index1, index2);
    }

    public Ability getNextAbility() {
        int index = order.remove(0);
        order.add(index);
        return abilities.get(index);
    }
}

