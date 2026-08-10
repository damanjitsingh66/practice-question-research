package practice;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {


    public static Student instance ;

    private Student() {
        System.out.println("-> Student constructor called by: " + Thread.currentThread().getName());
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
}
