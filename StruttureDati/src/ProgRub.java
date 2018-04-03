public class ProgRub {
    public static void main(String args[]){
        Rubrica rubrica=new Rubrica();
        Menu menu=new Menu();
        int scelta;
        scelta=menu.scelta();
        while(scelta!=4){
            if(scelta==1){
                Voce v=new Voce();
                rubrica.aggiungiVoce(v);
            }
            else if(scelta==2){

                int indice=menu.leggiIndice();
                rubrica.eliminaVoce(indice);
            }
            else if(scelta == 3){
                rubrica.visualizza();
            }
            scelta=menu.scelta();
        }
        System.out.println("Fine programma");
    }
}
