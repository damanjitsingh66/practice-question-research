package dppp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {

        SingluDb s1 = SingluDb.instance;
        SingluDb s2 = SingluDb.instance;


        if(s1==s2){
            System.out.println("both are same because they are enum objects");
        }
        SingleMyDb s3 = SingleMyDb.getInstance();
        SingleMyDb s4 = SingleMyDb.getInstance();

        if(s3==s4){
            System.out.println("both are same");
        }

        //attack one reflection
//        Constructor<SingleMyDb> constructor = SingleMyDb.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        SingleMyDb singleMyDb = constructor.newInstance();
//
//        if(s4==singleMyDb){
//            System.out.println("both are same because they are saved using reflection protection");
//        }
//        else{
//            System.out.println("both are not same under reflection attack");
//        }

        //attack two clone
//        SingleMyDb singleMyDbClone = s4.clone();
//        if(s4==singleMyDbClone){
//            System.out.println("both are same because they are saved using clone protection");
//        }
//        else{
//           System.out.println("both are not same under clone attack");
//        }

        //serializeAttack


        FileOutputStream file = new FileOutputStream("abc.sh");
        ObjectOutputStream outputStream = new ObjectOutputStream(file);

        outputStream.writeObject(SingleMyDb.getInstance());

        FileInputStream fileInputStream = new FileInputStream("abc.sh");

        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);

        SingleMyDb singleMyDb = (SingleMyDb) inputStream.readObject();

        if(s4==singleMyDb){
            System.out.println("both are same because they are saved using serializable protection");
        }
        else{
           System.out.println("both are not same under serialize attack");
       }

    }
}
