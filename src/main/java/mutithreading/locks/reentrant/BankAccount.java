package mutithreading.locks.reentrant;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount{
        private int balance = 100;
        private Lock lock = new ReentrantLock();

    private void withDrawl(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if(balance>=amount){
                    System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                    balance -= amount;
                    System.out.println(Thread.currentThread().getName() + " user cash withdrwal of amount - "+amount +" successfull. Remaining balance is - "+ balance);
                }
                else{
                    System.out.println(Thread.currentThread().getName() +" insufficient balance"+ balance +" to proceed with requested amount");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName() + " this thread could'nt able to aquire the lock");
            }
        }
        catch(Exception ex){
            Thread.currentThread().interrupt();
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        BankAccount sbi = new BankAccount();

        Runnable task = () -> sbi.withDrawl(50);

        Thread t1 = new Thread(task,"t1");
        Thread t2 = new Thread(task,"t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }


}
