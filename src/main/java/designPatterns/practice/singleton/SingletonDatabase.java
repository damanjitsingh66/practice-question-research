package designPatterns.practice.singleton;


import questions.singleton.Singleton;

import java.io.Serial;
import java.io.Serializable;

public class SingletonDatabase implements Cloneable, Serializable {

    private static volatile SingletonDatabase database;

    public static SingletonDatabase getInstance(){

      if(database == null){

          synchronized (SingletonDatabase.class) {
              database = new SingletonDatabase();
          }
      }
      return database;
    }

    //protection against reflection

    private SingletonDatabase()
    {
        if(database!=null){
            throw new RuntimeException("use getInstance() instead");
        }
    }

    //protection against clone attack
    @Override
    public Object clone() throws CloneNotSupportedException{
      throw new CloneNotSupportedException();
    }

    @Serial
    private Object readResolve(){
        return database;
    }
}
