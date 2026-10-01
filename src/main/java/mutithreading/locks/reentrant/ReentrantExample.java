package mutithreading.locks.reentrant;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
//reentrant lock is the lock that is used to make thread able to acquire the lock again
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
