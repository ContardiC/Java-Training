import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileManager {
    File file;
    RandomAccessFile randomAccessFile;
    final int MAX_LENGHT=15;

    public FileManager(File file){
        this.file=file;
    }

    public void open(){
        try{
            randomAccessFile=new RandomAccessFile(file,"rw");

        }catch(FileNotFoundException ex){
            ex.printStackTrace();

        }

    }

    public long numberOfRecords(long recordSize){
        long lenght=1;
        long res=0;

            try {
                lenght = randomAccessFile.length();
            }catch(IOException ex){
                ex.printStackTrace();
            }
            res=lenght/recordSize;


        return res;
    }
    public boolean write(User user){
        boolean res=false;
            try {
                System.out.println(" POS: "+38*numberOfRecords(38));
                randomAccessFile.skipBytes((int)(38*numberOfRecords(38)));
                randomAccessFile.writeInt(user.getID());
                randomAccessFile.writeInt(user.getBirthYear());
                writeString(user.getLastName(),user.getLastName().length());


                res=true;
            }catch(IOException ex){
                res=false;
                ex.printStackTrace();
            }

        return res;
    }
    public void writeString(String str,int len){
        System.out.println(" Stringa: "+str);
        System.out.println(" Lunghezza :"+len);
        try {
            randomAccessFile.writeChars(str);
        }catch(IOException ex){
            ex.printStackTrace();
        }
        for(int i=len;i<MAX_LENGHT;i++){
            try{
                randomAccessFile.writeChar('\0');
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public void readAll(){

            try{
                randomAccessFile.seek(0);
                for(int i=0;i<numberOfRecords(38);i++){
                    System.out.println(" "+randomAccessFile.readInt());
                    System.out.println(" "+randomAccessFile.readInt());
                    for(int j=0;j<MAX_LENGHT;j++){
                        char tmp;
                        tmp=randomAccessFile.readChar();
                        if(tmp!='\0'){
                             System.out.print(tmp);
                        }
                       
                    }
                    System.out.println("");
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }

    }

}
