package it.project1.monster;

import java.util.ArrayList;
import java.util.List;

public class shop {

    private final List<Oggetto> oggettiInVendita;
    private final player proprietario;

    public shop(player proprietario) {
        this.proprietario = proprietario;
        oggettiInVendita = new ArrayList<>();
    }

    public void aggiungiOggetto(Oggetto oggetto) {
        oggettiInVendita.add(oggetto);
    }

    public void rimuoviOggetto(Oggetto oggetto) {
        oggettiInVendita.remove(oggetto);
    }

    public <Oggetto> void mostraOggettiInVendita() {
        System.out.println("Oggetti in vendita nel negozio di " + proprietario.getName() + ":");
        for (it.project1.monster.Oggetto oggetto : oggettiInVendita) {
            System.out.println(oggetto.getName() + " - " + oggetto.getPrice() + " monete");
        }
    }

    public void buyObject(player acquirente, Oggetto oggetto) {
        if (acquirente.addMoney(oggetto.getPrice()) >= oggetto.getPrice()) {
            acquirente.addObject(oggetto);
            proprietario.addMoney(oggetto.getPrice());
            acquirente.removeMoney(oggetto.getPrice());
            rimuoviOggetto(oggetto);
            System.out.println(acquirente.getName() + " ha acquistato " +
                    oggetto.getName() + " dal negozio di " + proprietario.getName());
        } else {
            System.out.println(acquirente.getName() + " non ha abbastanza monete per acquistare " + oggetto.getName());
        }
    }

}

