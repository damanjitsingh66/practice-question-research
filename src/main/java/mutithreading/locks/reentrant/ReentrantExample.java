package mutithreading.locks.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final Lock lock = new ReentrantLock();

    private void innerMethod(){
        lock.lock();
        try{
            System.out.println("inner method");
        }
        finally {
            lock.unlock();
        }
    }
    private void outerMethod(){
        lock.lock();
        try{
            innerMethod();
            System.out.println("outer method");
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }

}
