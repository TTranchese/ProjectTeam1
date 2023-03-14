package it.project1.shop;


public class SellOrder extends Order {

    private double priceMin;
    public SellOrder(String nomeOggetto, double prezzo, double prezzoMin, Player player) {
        super(nomeOggetto, prezzo, player);
        this.priceMin = prezzoMin;
    }

    public double getPrezzoMin() {
        return priceMin;
    }
}