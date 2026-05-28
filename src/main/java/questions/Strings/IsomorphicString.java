package questions.Strings;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

    public static void main(String[] args) {

        String s = "people";
        String t = "tiogt";

        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t){

        Map<Character, Character> assignmentMap = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(assignmentMap.containsKey(c1)){

                if(assignmentMap.get(c1) != c2){
                    return false;
                }

            } else {

                if(assignmentMap.containsValue(c2)){
                    return false;
                }

                assignmentMap.put(c1, c2);
            }
        }
        return true;
    }
}