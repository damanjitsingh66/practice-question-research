package dppp;

import java.io.Serial;
import java.io.Serializable;

public class SingleMyDb implements Cloneable, Serializable {

    private static volatile SingleMyDb instance;

    public static SingleMyDb getInstance() {

        if(instance==null) {
            synchronized (SingleMyDb.class) {
                if(instance == null) {
                    instance = new SingleMyDb();
                }
            }
        }
        return  instance;
    }

    private SingleMyDb(){
        if(instance!=null){
            throw new RuntimeException("use getInstance");
        }
    }

    @Override
    public SingleMyDb clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException();
    }

    @Serial
    public Object readResolve(){
        return instance;
    }
}
