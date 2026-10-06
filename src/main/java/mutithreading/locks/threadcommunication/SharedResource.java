package mutithreading.locks.threadcommunication;

public class SharedResource {
    private int data;
    private boolean hasData;


    public void produce(int value){
                try{

                    wait();
                }
                catch (InterruptedException ex){

                }
    }
    public int consume(){

        return 0;
    }


}
