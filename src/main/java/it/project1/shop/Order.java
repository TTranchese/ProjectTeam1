package it.project1.shop;

public abstract class Order implements Comparable<Order> {
    private String nomeOggetto;
    private double prezzo;
    private Player player;

    public Order(String nomeOggetto, double prezzo, Player player) {
        this.nomeOggetto = nomeOggetto;
        this.prezzo = prezzo;
        this.player = player;
    }

    public String getNomeOggetto() {
        return nomeOggetto;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public Player getPlayer() {
        return player;
    }

    public int compareTo(Order otherOrder) {
        if (this.prezzo > otherOrder.getPrezzo()) {
            return 1;
        } else if (this.prezzo < otherOrder.getPrezzo()) {
            return -1;
        } else {
            return 0;
        }
    }
