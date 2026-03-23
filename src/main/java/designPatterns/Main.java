package designPatterns;

public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if(singleton2==singleton1){
            System.out.println("both are same");
        }
        else{
            System.out.println("both are not same");
        }
    }
}
