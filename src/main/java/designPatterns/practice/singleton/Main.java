package designPatterns.practice.singleton;

import questions.linkedlist.onedimensional.SearchInLinkedList;
import questions.singleton.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {



        SingletonDatabase s1 = SingletonDatabase.getInstance();
        SingletonDatabase s2 = SingletonDatabase.getInstance();

        SingEnum s3 = SingEnum.INSTANCE;
        SingEnum s4 = SingEnum.INSTANCE;



        //breaking of singleton pattern
        //1. Using reflection breaking
//        Constructor<SingletonDatabase> constructor = SingletonDatabase.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        SingletonDatabase s5 = constructor.newInstance();

       //2.Using Cloneable
//        SingletonDatabase s6 = (SingletonDatabase) s1.clone();


        //3.Using Serializable interface
        ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("abc.ser"));

        SingletonDatabase s7 = SingletonDatabase.getInstance();

        out.writeObject(s7);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.ser"));

        SingletonDatabase s8 = (SingletonDatabase) in.readObject();




        if(s7==s8){
            System.out.println("both non-enumed are same");
        }
        else{
            System.out.println("both non-enumed are not same");
        }

        if(s3==s4){
            System.out.println("both enumed are same");
        }
        else{
            System.out.println("both enumed are not same");
        }
    }
}
