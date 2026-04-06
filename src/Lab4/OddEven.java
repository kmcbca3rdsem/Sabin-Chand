package Lab4;

public class OddEven {
    public static void main(String[] args){
        Even even = new Even();
        Odd odd = new Odd();
        Thread evenT = new Thread(even);
        Thread oddT = new Thread(odd);
        evenT.start();
        oddT.start();
    }
}

class Even implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=20;i+=2){
            System.out.println(i);
        }
    }
}

class Odd implements Runnable{
    public void run(){
        int i;
        for(i=1;i<=20;i+=2){
            System.out.println(i);
        }
    }
}

