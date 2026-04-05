package questions.random;

import java.io.FilterOutputStream;

public class FirstMatchingCharacterBothEnds {

    public static void main(String[] args) {

     String s = "abcdab";

     System.out.println(firstMatchingIndex(s));


    }

    public static int firstMatchingIndex(String s) {

        int start = 0;
        int end = s.length()-1;

        while (start<=end){

            if(s.charAt(start)==s.charAt(end)){
                return start;
            }
            start++;
            end--;
        }

        return -1;

    }
}
