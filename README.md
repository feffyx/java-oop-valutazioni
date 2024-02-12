State costruendo un programma per un corso di studi (:megafono: NON QUESTO NON PREOCCUPATEVI <br/>
La valutazione complessiva viene fatta sulla percentuale di assenze (da 0 a 100) e la media dei voti (da 0 a 5):<br/>
- se lo studente ha fatto più del 50% di assenze è bocciato<br/>
- se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2<br/>
- se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2<br/>
# Implementazione
Nel progetto java-oop-valutazioni, package org.lessons.java.valutazioni inserire due classi:<br/>
Classe Studente con tre attributi:<br/>
- id dello studente (intero),<br/>
- percentuale assenze (intero),<br/>
- media voti (numero decimale).<br/>
Deve avere anche un metodo che calcola, in base a percentuale assenze e media voti, se lo studente è promosso o bocciato.<br/>
Classe Corso che contiene una lista di studenti e che espone metodi per:<br/>
mostrare a video l’elenco di tutti gli studenti con i relativi dati<br/>
aggiungere o rimuovere uno studente dalla lista<br/>
dare la percentuali di studenti promossi<br/>
Aggiungere una classe Main in cui create un Corso e aggiungete un numero random di studenti compreso tra 10 e 20:<br/> l’id dello studente deve essere un numero progressivo, mentre le assenze e i voti sono dei numeri casuali.
Mostrate poi a video l’elenco degli studenti e la percentuale dei promossi<br/>
Usate il debugger per aiutarvi ad analizzare come funziona il vostro programma
