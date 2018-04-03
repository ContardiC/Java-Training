public class PingPong {
    public static void main(String[] args) {

        // Primo giocatore

        Thread thr1 =new Thread(new Racchetta("ping"));
        thr1.start();

        // Secondo giocatore

        Thread thr2=new Thread(new Racchetta("pong"));
        thr2.start();


    }

    //ESERCIZIO

    /*

    1 Realizza un programma che simuli la corsa alla merenda
    dei tre nipoti di zio Paperino facendo
    avanzare casualmente la posizione di ciascuno di essi e verifi cando se viene
     raggiunto il
    traguardo: il primo che raggiunge i 10 m mangia la merenda.
    2 Utilizza per la creazione dei thread entrambi i meccanismi descritti in
    questa esercitazione.

     */

}
