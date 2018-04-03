import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Voce {
    private String nome=new String();
    private String telefono=new String();
    public Voce(){
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader tastiera=new BufferedReader(input);
        System.out.print("Nome");
        try{
            nome=tastiera.readLine();
        }catch(IOException e){}
        System.out.print("Telefono");
        try{
            telefono=tastiera.readLine();
        }catch(IOException e){}
    }
    public void stampa(){

    }
}
