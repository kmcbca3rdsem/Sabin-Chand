package Lab4;

public class SleepDemo implements Runnable {
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println(i);
            try{
                Thread.sleep(500);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){
        SleepDemo sleepDemo = new SleepDemo();
        Thread t = new Thread(sleepDemo);
        t.start();
    }
}
