package practice.comparableAndComparator;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = Student.getInstance();


        //1. serialize attack

//        ObjectOutputStream objectOutputStream  = new ObjectOutputStream( new FileOutputStream("abc.sh"));
//         objectOutputStream.writeObject(s1);
//         objectOutputStream.flush();
//         objectOutputStream.close();
//
//         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.sh"));
//        Student s2 =(Student) objectInputStream.readObject();
//
//        objectInputStream.close();


        //2. Clone attack
//         Student s2 = s1.clone();

        //3. Reflection attack
        Constructor<Student> studentConstructor = Student.class.getDeclaredConstructor();
        studentConstructor.setAccessible(true);

        Student s2= studentConstructor.newInstance();


        if(s1==s2){
         System.out.println("both are same");
        }
        else{
            System.out.println("both are not same");
        }

    }


}
