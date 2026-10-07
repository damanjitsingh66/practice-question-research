package mutithreading.locks.threadcommunication;

public class Consumer implements Runnable{
    SharedResource resource = new SharedResource();

    public Consumer(SharedResource sharedResource){
        this.resource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            resource.consume();
        }
    }
}
