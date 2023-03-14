package it.project1.shop;

public class Item {
    private String name;
    private double price;
    private final int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNome() {
        return name;
    }

    public double getPrezzo() {
        return price;
    }

    public int getQuantita() {
        return quantity;
    }
}




