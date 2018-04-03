public class Racchetta implements Runnable {
    String pallina;
    public Racchetta(String pallina){
        this.pallina=pallina;
    }
    public void run(){
        while(true){
            System.out.println(pallina);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}
