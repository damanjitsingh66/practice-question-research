package mutithreading.locks.synchronisedorimplicit;

public class ImplicitCounter {

    private int count =0;

    //synchronized keyword ensures that only one thread can increment the method at once
    //its also called implicit lock its don't have try lock machanism dont have control on timeout sceanario
    public synchronized void increment(){
        count ++;
    }
    public int getCount(){
        return count;
    }
}
