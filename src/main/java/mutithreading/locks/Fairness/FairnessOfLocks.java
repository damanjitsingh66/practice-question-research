package mutithreading.locks.Fairness;

import org.j_paine.formatter.EndOfFileWhenStartingReadException;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessOfLocks {
    //Fairness of locks means maintaining the order in which locks are acquired.
    private final Lock lock = new ReentrantLock(true);

    private void accessSource(){
        lock.lock();
        try{
         System.out.println(Thread.currentThread().getName() + " - " + " its acquired.");
         Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

    FairnessOfLocks fairnessOfLocks = new FairnessOfLocks();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            fairnessOfLocks.accessSource();
        }
    };

    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable);
    Thread t3 = new Thread(runnable);

    t1.start();
    t2.start();
    t3.start();

    t1.join();
    t2.join();
    t3.join();

    }
}
