package it.project1.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Market {
    private List<Item> object;
    private List<Order> orders;


    public Market() {
        this.object = new ArrayList<Item>();
        this.orders = new ArrayList<Order>()  ;
    }

    public void aggiungiOggetto(Item item) {
        object.add(item);
    }

    public void rimuoviOggetto(Item item) {
        object.remove(item);
    }

    public void aggiungiOrdine(Order order) {
        orders.add(order);
    }

    public void rimuoviOrdine(Order order) {
        orders.remove(order);
    }

    public void executeOrders() {
        Object ArrayList = new Object();
        Collections.sort(ArrayList<String>Order);  //qui non so cosa mettere
        for (Order order : orders) {
            if (order instanceof BuyOrder) {
                BuyOrder buyOrder = (BuyOrder) order;
                for (Item item : object) {
                    if (item.getNome().equals(buyOrder.getNomeOggetto())) {
                        if (item.getPrezzo() <= buyOrder.getPrezzoMax()) {
                            Player player = buyOrder.getPlayer();
                            player.compraOggetto(item, item.getPrezzo());
                            orders.remove(buyOrder);
                            break;
                        }
                    }
                }
            } else if (order instanceof SellOrder) {
                SellOrder sellOrder = (SellOrder) order;
                for (Item item : sellOrder.getPlayer().getOggetti()) {
                    if (item.getNome().equals(sellOrder.getNomeOggetto())) {
                        if (item.getPrezzo() >= sellOrder.getPrezzoMin()) {
                            Player player = sellOrder.getPlayer();
                            player.vendeOggetto(item, item.getPrezzo());
                            orders.remove(sellOrder);
                            break;
                        }
                    }
                }
            }
        }
    }

    public void addObject(Item Object) {
    }

    public void executeOrders() {
    }

    public void addOrders(BuyOrder spadaDiLegno) {
    }

    public void addOrders(SellOrder asciaDiFerro) {
    }
}
