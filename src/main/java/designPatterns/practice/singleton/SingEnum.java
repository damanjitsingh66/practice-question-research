package designPatterns.practice.singleton;

public enum SingEnum {
    INSTANCE;

    public void connect(){
        System.out.println("database connected.........");
    }
}
