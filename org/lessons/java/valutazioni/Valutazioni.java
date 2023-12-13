package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.List;

class Studente {
    private static int idCounter = 1;

    private final int id;
    private final int percentualeAssenze;
    private final double mediaVoti;

    public Studente(int percentualeAssenze, double mediaVoti) {
        this.id = idCounter++;
        this.percentualeAssenze = percentualeAssenze;
        this.mediaVoti = mediaVoti;
    }

    public boolean isPromosso() {
        if (percentualeAssenze > 50) {
            return false; // Bocciato
        } else // Bocciato
            if (percentualeAssenze >= 25 && mediaVoti > 2) {
            return true; // Promosso
        } else return percentualeAssenze < 25 && mediaVoti >= 2; // Promosso
    }

    @Override
    public String toString() {
        return "Studente " + id + ": Assenze = " + percentualeAssenze + "%, Media Voti = " + mediaVoti;
    }
}

class Corso {
    private final List<Studente> studenti = new ArrayList<>();

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public void mostraElencoStudenti() {
        for (Studente studente : studenti) {
            System.out.println(studente);
        }
    }

    public double percentualeStudentiPromossi() {
        long promossi = studenti.stream().filter(Studente::isPromosso).count();
        return (double) promossi / studenti.size() * 100;
    }
}

