import java.io.*;

public class ArchiveManager {



    public static void main(String args[]){
        User user;
        int opt=-1;
        boolean  exitTheMenu=false;
        // Keyboard
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader keyboard=new BufferedReader(in);
        File myFile=new File("archivio.dat");
        FileManager fileManager=new FileManager(myFile);
        fileManager.open();
        do{
            System.out.println(" 0 : Esci dal programma ");
            System.out.println(" 1 : Scrivi un nuovo record ");
            System.out.println(" 2 : Leggi un record ");
            System.out.println(" 3 : Numero di records");
            try{
                opt=Integer.parseInt(keyboard.readLine());
            }catch(IOException ex){
                ex.printStackTrace();
            }
            switch(opt){
                case 0:
                    exitTheMenu=true;
                    break;
                case 1:
                    user=new User(1,1981,"Contardi");
                    fileManager.write(user);
                    break;
                case 2:
                    fileManager.readAll();
                    break;
                case 3:
                    long nRecords=fileManager.numberOfRecords(38);
                    System.out.println("Ci sono : "+nRecords +" records");
                    break;
            }
        }while(exitTheMenu==false);





    }
}
