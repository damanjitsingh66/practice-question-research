package questions.singleton;

import java.lang.reflect.Constructor;
import java.net.SocketImpl;
import java.security.Signature;

public class Main {

    public static void main(String[] args) throws Exception {

     Singleton s1= Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();


        Constructor<Singleton> singletonConstructor = Singleton.class.getDeclaredConstructor();
        singletonConstructor.setAccessible(true);
        Singleton s4 = singletonConstructor.newInstance();


        if(s1==s4){
         System.out.println("both are equal");
     }


    }
}
