package it.project1.shop;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Item> object;
    private double money;

    public Player(double money) {
        this.object = new ArrayList<>();

    }

    public List<Item> getOggetti() {
        return object;
    }

    public double getDenaro() {
        return money;
    }

    public void compraOggetto(Item item, double prezzo) {
        if (money >= prezzo) {
            money -= prezzo;
            object.add(item);
        }
    }

    public void vendeOggetto(Item item, double prezzo) {
        if (object.contains(item)) {
            object.remove(item);
            money += prezzo;
        }
    }
}
