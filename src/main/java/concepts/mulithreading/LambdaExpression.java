package concepts.mulithreading;

import java.awt.*;

public class LambdaExpression {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=0; i<10;i++){
                System.out.println("Hello World");
            }
        }
        );
        t1.start();
    }
}
