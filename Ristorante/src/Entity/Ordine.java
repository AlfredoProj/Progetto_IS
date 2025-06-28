package Entity;

import java.util.*;

public class Ordine {
    private Tavolo tavolo;
    private int stato;
    private Map<Ordinabile, Integer> elementi_ordine;

    public void addOrdinato(Ordinabile elem) {
    }

    public double calcolaPrezzo() {
        return 0;
    }

    public void confermaOrdine() {
    }

    public void decrementaQuantita(Ordinabile elem) {
    }

}