package mutithreading.ways.ThreadClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("hello");
        myThread.join();
    }
}
