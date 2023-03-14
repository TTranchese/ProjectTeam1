package it.project1.shop;

public class BuyOrder extends Order {
    private double priceMax;
    public BuyOrder(String nameObject, double price, double priceMax, Player player) {
        super(nameObject, price, player);
        this.priceMax = priceMax;
    }

    public double getPrezzoMax() {
        return priceMax;
    }
}
