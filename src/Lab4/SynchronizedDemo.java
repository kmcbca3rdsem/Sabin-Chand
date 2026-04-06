package Lab4;

public class SynchronizedDemo implements Runnable {
    public void run(){
        synchronized (this){
                System.out.println("Booked");

        }
    }
    public static void main(String[] args){
        SynchronizedDemo syncDemo = new SynchronizedDemo();
        Thread t = new Thread(syncDemo);
        t.start();
    }
}
