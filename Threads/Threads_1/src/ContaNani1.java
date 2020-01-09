public class ContaNani1 extends Thread {
    public void run(){
        setName("Sette Nani");
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<27;i++){
            System.out.println((i+1)+ " ");
        }
    }
}
