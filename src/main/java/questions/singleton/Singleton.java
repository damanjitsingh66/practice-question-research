package questions.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Singleton {

    private static Singleton instance;

    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
            Arrays.asList(1,2);

        }
        return instance;
    }

}
