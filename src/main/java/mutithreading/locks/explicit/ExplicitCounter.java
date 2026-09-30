package mutithreading.locks.explicit;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitCounter {

    private final Lock lock = new ReentrantLock();
    //this is the explicit lock - these are the lock objects such as reentrant lock that you create and manage yourself. you can apply try lock with timeout
    private int count = 0;

    public void increment(){
        lock.lock();
        try{
            count++;
        }
        finally {
            lock.unlock();  //make sure to unlock
        }

    }
    public int getCount(){
        return count;
    }
}
