package designPatterns.practice.singleton;


public class SingletonDatabase {

    private static volatile SingletonDatabase database;

    public static SingletonDatabase getInstance(){

      if(database == null){

          synchronized (SingletonDatabase.class) {
              database = new SingletonDatabase();
          }
      }
      return database;
    }
}
