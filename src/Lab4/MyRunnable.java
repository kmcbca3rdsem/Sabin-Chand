package Lab4;

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Thread");
        }
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj); // create thread using Runnable
        t.start(); // start the thread
    }
}