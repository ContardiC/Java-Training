public class ProvaNani2 {
    public static void main(String args[]){
        Thread thread1=new ContaNani2("Goku");
        Thread thread2=new ContaNani2("Vegeta");
        thread1.start();
        thread2.start();
    }
}
