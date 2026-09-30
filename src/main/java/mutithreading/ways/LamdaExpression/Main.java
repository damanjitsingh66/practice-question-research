package mutithreading.ways.LamdaExpression;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(()->{
            System.out.println("lambda creation");
        });

        t.start();
        System.out.println("hello this is a");
        t.join();
    }
}
