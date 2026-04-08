package questions.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {

      String n = "acvavbab";
      Map<Character,Integer> map = new HashMap<>();

      for(char c : n.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+ 1);
      }

      String s1= "abc";
      String s2 = "cab";
        System.out.println(isAnagram(s1,s2));


    }

   public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
