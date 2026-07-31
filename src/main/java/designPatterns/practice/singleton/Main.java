package designPatterns.practice.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonDatabase s1 = SingletonDatabase.getInstance();
        SingletonDatabase s2 = SingletonDatabase.getInstance();


        if(s1==s2){
            System.out.println("both are same");
        }
        else{
            System.out.println("both are not same");
        }

    }
}
