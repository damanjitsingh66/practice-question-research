package questions.Strings;

import java.util.Arrays;

public class AnagramString {

    public static void main(String[] args) {

        String s = "cat";
        String t = "atx";

    System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
         char[] a = s.toCharArray();
        char[] b= t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    //tc= n log(n)
}
