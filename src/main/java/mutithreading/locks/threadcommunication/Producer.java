package mutithreading.locks.threadcommunication;

public class Producer implements Runnable{
   SharedResource resource = new SharedResource();

   public Producer(SharedResource resource){
       this.resource = resource;
   }

    @Override
    public void run() {
       for(int i=1;i<=10;i++){
           resource.produce(i);
       }
    }
}
