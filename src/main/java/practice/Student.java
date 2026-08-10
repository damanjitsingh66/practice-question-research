package practice;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable,Cloneable {


    public static Student instance ;

    private Student() {
       if(instance!=null){
           throw new RuntimeException("method not allowed use getInstance() instead:");
       }
    }

    public static Student getInstance() throws InterruptedException {

        if(instance==null) {
            synchronized (Student.class) {
                instance = new Student();
            }
        }
        return instance;
    }

    @Serial
    public Object readResolve(){
        return instance;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
     throw new CloneNotSupportedException("clone not supported");
    }

}
