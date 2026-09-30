package mutithreading.locks;


import mutithreading.locks.explicit.ExplicitCounter;
import mutithreading.locks.synchronisedorimplicit.ImplicitCounter;

public class CountThread extends Thread{
    private ExplicitCounter counter;

    public CountThread(ExplicitCounter counter1){
        this.counter = counter1;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            counter.increment();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ExplicitCounter counter1  = new ExplicitCounter();
        CountThread c1 = new CountThread(counter1);
        CountThread c2 = new CountThread(counter1);

        c1.start();
        c2.start();

        c1.join();
        c2.join();
        System.out.println(counter1.getCount());
    }
}
