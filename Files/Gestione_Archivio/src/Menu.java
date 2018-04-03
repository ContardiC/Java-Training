import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void main(String args[]){
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader keyboard=new BufferedReader(in);
        FileManager fileManager=new FileManager();
        int id=0;
        int birthYear=0;

        int opt=-1;
        boolean exitTheMenu=false;
        User user;
        do{
            System.out.println(" 0: Esci");
            System.out.println(" 1: Scrivi un record");
            System.out.println(" 2: Leggi un record");
            try{
                opt=Integer.parseInt(keyboard.readLine());
            }catch(IOException exc){
                exc.printStackTrace();
            }
            switch (opt){
                case 0:
                    exitTheMenu=true;
                    break;
                case 1:
                    System.out.println("Inserisci la matricola");
                    try{
                        id=Integer.parseInt(keyboard.readLine());
                    }catch (IOException exc){
                        exc.printStackTrace();
                    }
                    System.out.println("Inserisci l'anno di nascita");
                    try{
                        birthYear=Integer.parseInt(keyboard.readLine());
                    }catch (IOException exc){
                        exc.printStackTrace();
                    }
                    user=new User(id,birthYear);

                    System.out.println(user.toString());
                    if(fileManager.createFile()){
                        System.out.println("Il file è stato creato");
                        fileManager.writeData(user);
                    }else{
                        System.out.println("Il file non è stato creato");
                    }


                    break;
                case 2:
                    fileManager.readData();
                    break;
            }


        }while(!exitTheMenu);




    }
}
