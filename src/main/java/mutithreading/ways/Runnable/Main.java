package mutithreading.ways.Runnable;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new MyRunnable());
         t.start();

         System.out.println("hello");
         t.join();
    }
}
