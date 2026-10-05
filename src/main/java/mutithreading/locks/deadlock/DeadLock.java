package mutithreading.locks.deadlock;

public class DeadLock {


    public static void main(String[] args) throws InterruptedException {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen,paper),"t1");
        Thread t2 = new Thread(new Task2(pen,paper),"t2");

         t1.start();
         t2.start();

    }
}
