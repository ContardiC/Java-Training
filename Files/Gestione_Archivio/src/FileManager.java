import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileManager {
    private User user;
    private RandomAccessFile randomAccessFile;
    public FileManager(){
    }
    public boolean createFile(){
        boolean isFound=true;
        File file=new File("archivio.dat");
        try {
             randomAccessFile = new RandomAccessFile(file, "rw");
        }catch(FileNotFoundException exc){
            isFound=false;
            exc.printStackTrace();
        }
        return isFound;
    }
    public void writeData(User user){
        this.user=user;
        try {
            randomAccessFile.writeInt(user.getId());
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            randomAccessFile.writeInt(user.getBirthYear());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readData(){
        try{
            randomAccessFile.seek(0);
            System.out.println(" ID: "+randomAccessFile.readInt());
            System.out.println(" Anno di Nascita: "+randomAccessFile.readInt());

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
