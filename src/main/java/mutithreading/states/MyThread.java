package mutithreading.states;

public class MyThread extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("RUNNING");
            Thread.sleep(2000);
        }catch (Exception ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws InterruptedException {

     MyThread myThread = new MyThread();
     System.out.println(myThread.getState());
     myThread.start();
     System.out.println(myThread.getState());
     Thread.sleep(100);
     System.out.println(myThread.getState());
     myThread.join();
     System.out.println(myThread.getState());

    }
}
