package it.project1.shop;

public class Main {
    public static void main(String[] args) {
// Creazione del market
        Market market = new Market();
        // Creazione dei giocatori
        Player player1 = new Player(100.0);
        Player player2 = new Player(200.0);

        // Aggiunta di oggetti al market
        market.addObject(new Item("Spada di legno", 10.0, 5));
        market.addObject(new Item("Ascia di ferro", 20.0, 3));
        market.addObject(new Item("Scudo di metallo", 15.0, 2));

        // Aggiunta di ordini al market
        market.addOrders(new BuyOrder("Spada di legno", 5.0, 15.0, player1));
        market.addOrders(new SellOrder("Ascia di ferro", 25.0, 10.0, player2));

        // Esecuzione degli ordini


        // Stampa degli oggetti dei giocatori e del loro denaro
        System.out.println("Oggetti di player1:");
        for (Item item : player1.getOggetti()) {
            System.out.println(item.getNome() + " - " + item.getPrezzo());
        }
        System.out.println("Denaro di player1: " + player1.getDenaro());

        System.out.println("Oggetti di player2:");
        for (Item item : player2.getOggetti()) {
            System.out.println(item.getNome() + " - " + item.getPrezzo());
        }
        System.out.println("Denaro di player2: " + player2.getDenaro());
    }
}
