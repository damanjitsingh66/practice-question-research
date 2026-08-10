package practice;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = Student.getInstance();


        //1. serialize attack

        ObjectOutputStream objectOutputStream  = new ObjectOutputStream( new FileOutputStream("abc.sh"));
         objectOutputStream.writeObject(s1);
         objectOutputStream.flush();
         objectOutputStream.close();

         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.sh"));
        Student s2 =(Student) objectInputStream.readObject();

        objectInputStream.close();

        if(s1==s2){
         System.out.println("both are same");
        }
        else{
            System.out.println("both are not same");
        }

    }


}
