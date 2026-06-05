package questions.Strings;

import java.util.HashMap;
import java.util.Map;

public class RomantoInteger {
    public static void main(String[] args) {


        String  s = "LVIII";
// I = 1, V = 5, X = 10,L = 50, C = 100, D = 500, M = 1000
        //Roman numerals are usually written largest to smallest from left to right. But in six special cases, subtraction is used instead of addition:
        //I before V or X → 4 and 9,
        //X before L or C → 40 and 90,
        //C before D or M → 400 and 900

        //MCMXCIV
        //1994
        Map<Character,Integer> romans = new HashMap<>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        int sum =0;
     for(char c :s.toCharArray()){

         if(romans.containsKey(c)){
             int matchedValue = romans.get(c);
             sum = sum + matchedValue;
         }
     }
     System.out.println(sum);
//tc
    }
}
