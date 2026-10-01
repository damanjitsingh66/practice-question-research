package mutithreading.locks.ReadWrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriterCounter {

    ReadWriteLock lock = new ReentrantReadWriteLock(false);
    Lock read = lock.readLock();
    Lock write = lock.writeLock();
    int count = 0;

    public int getCount(){
        try {
            read.lock();
            return count;
        }
       finally {
            read.unlock();
        }
    }
    public void increment(){
        write.lock();
        try {

            count++;
            Thread.sleep(50);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            write.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ReadWriterCounter counter = new ReadWriterCounter();

        Runnable read  = () -> {
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName() + " read: " + counter.getCount());

            }
        };
        Runnable write  = () -> {
            for(int i=0;i<10;i++){
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " incremented");
            }
        };

        Thread t1= new Thread(read);
        Thread t2 = new Thread(write);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }


}
