package designPatterns;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class BreakSingleton {
    public static void main(String[] args) throws Exception  {
        //reflection attack
//        Singleton s1 = Singleton.getInstance();
//
//        Constructor<Singleton> constructor =
//                Singleton.class.getDeclaredConstructor();
//
//        constructor.setAccessible(true);
//
//        Singleton s2 = constructor.newInstance();
//
//        System.out.println(s1 == s2); // ❌ false (BROKEN)

        //serialization attack
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file"));
        out.writeObject(instance);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file"));
        Singleton s2 = (Singleton) in.readObject();

        System.out.println(instance == s2); // ❌ false

    }
}
