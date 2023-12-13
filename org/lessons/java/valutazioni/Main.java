package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Corso corso = new Corso();
        Random random = new Random();
        int numeroStudenti = random.nextInt(11) + 10; // Numero casuale

        for (int i = 0; i < numeroStudenti; i++) {
            int percentualeAssenze = random.nextInt(101); // Percentuale
            double mediaVoti = random.nextDouble() * 5; // Media voti
            Studente studente = new Studente(percentualeAssenze, mediaVoti);
            corso.aggiungiStudente(studente);
        }

        // Elenco degli studenti
        corso.mostraElencoStudenti();

        // Calcola e mostra la percentuale degli studenti promossi
        double percentualePromossi = corso.percentualeStudentiPromossi();
        System.out.println("Percentuale studenti promossi: " + percentualePromossi + "%");
    }
}
