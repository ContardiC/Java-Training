public class DinDonDan {

    public static void main(String[] args) {

        // Prima modalità di definizione

        Runnable cam1=new Campana("din",5);
        Thread thr1=new Thread(cam1);
        thr1.start();

        // Seconda modalità di definizione

        Thread thr2=new Thread(new Campana("don",6));
        thr2.start();

        // Terza modalità di definizione
        new Thread(new Campana("dan",5)).start();

    }
    // ESERCIZI

    /*
    Modifica il programma precedente cercando di ottenere sullo schermo una sequenza ben
determinata di suoni, per esempio tre serie di “din-don-dan” semplicemente introducendo
dei ritardi per esempio con il metodo sleep(secondi), che blocca per un tempo specifi cato
l’esecuzione di un thread.
Manda in esecuzione più volte il programma per essere sicuro di aver ben sincronizzato (?!)
il sistema: quali osservazioni puoi fare?
3 Modifi ca ora il programma introducendo una nuova campana dal suono “dun”, che deve
essere alternata a ciascuna altra campana, cioè deve sempre seguire una delle tre campane
precedenti.
 Ad esempio una sequenza possibile è la seguente:
 “din-dun” - don-dun - din-dun - dan-dun”
     */

}
