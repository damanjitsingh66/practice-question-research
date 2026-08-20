package questions.practiceProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonSubesequenceUnique {
    public static void main(String[] args) {

        String input = "pwwkew";
        //output - 3 as abc

       System.out.println( longestCommonSubsequence(input));

    }
   public static int longestCommonSubsequence(String input){

       Map<Character,Integer> map = new HashMap<>();
       int left = 0;
       int max_length = 0;

       for(int i=0; i<input.length();i++){
           //i = right can be considered
        Character ch = input.charAt(i);

        if(map.containsKey(ch)){
            left = Math.max(left,map.get(ch) + 1);
        }
        map.put(ch,i);
        max_length = Math.max(max_length,i-left+1);
       }

   return max_length;
   }

}
