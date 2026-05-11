package questions.Strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveOuterParanthesis {


    public static void main(String[] args) {
        String in = "((()))";
        //"()(()())(())"
        // i have to remove outer one paranthesis

        //algorithm
        //
        Map<Integer,String> resultantMap = new HashMap<>();

     for(int i=0;i<in.length();i++){

         if(in.charAt(i)=='('){
             resultantMap.put(1,"x");
         }else{
             resultantMap.put(1,"y");
         }


     }

     for(Map.Entry<Integer,String> entry : resultantMap.entrySet()){
         System.out.println(entry.getKey()+"-" + entry.getValue());

     }



    }
}
