package questions.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class Singleton {

    private static volatile Singleton instance;

    public Singleton(){

    }

    public static Singleton getInstance(){

        if(instance==null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
