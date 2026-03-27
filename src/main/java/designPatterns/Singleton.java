package designPatterns;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {
    //lazy loading - in this object is only loaded when its needed
    private static volatile Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;

    }

    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance()");
        }
    }
    //provoke from serialization
    @Serial
    protected Object readResolve(){
        return instance;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException{
       throw new CloneNotSupportedException();
    }
}

