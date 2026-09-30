package mutithreading.methods;



public class ThreadMethods extends Thread{

    public ThreadMethods(String name){
        super(name);
    }
    @Override
    public void run (){

        for(int i=1;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println( Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority()+ " - " + "count " + i
                        );
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //yield() gives an temporary pause to the execution of current thread to allow other threads of same or higher priority to execute.

        Thread a1 = new Thread(()->{

            for(int i=0;i<5;i++){
                System.out.println( "Thread - "+Thread.currentThread().getName());
            }
            Thread.yield();
        });
        a1.start();
        a1.join();

        Thread a2 = new Thread(()->{

            for(int i=0;i<5;i++){
                System.out.println( "Thread - "+Thread.currentThread().getName());
            }
            Thread.yield();
        });
        a2.start();
        a2.join();


        ThreadMethods t1 = new ThreadMethods("MIN_PRIORITY");
        ThreadMethods t2 = new ThreadMethods("NORM_PRIORITY");
        ThreadMethods t3 = new ThreadMethods("MAX_PRIORITY");

        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();




        //interrupt is a way for one thread to request that another thread stop what it's doing or pay attention to cancellation
        Thread tx = new Thread(()->{
           while(true){
               try {
                   Thread.sleep(10005);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("i am working looped thread");
        }
        });
        tx.start();
        Thread.sleep(1000);
        tx.interrupt();

    }
}
