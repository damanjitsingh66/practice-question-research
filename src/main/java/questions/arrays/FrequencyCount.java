package questions.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {

      String n = "acvavbaba";

      Map<Character,Integer> map = new HashMap<>();

      for(int i=0;i<n.length();i++){
          char c = n.charAt(i);
          map.put(c,map.getOrDefault(c,0)+1);
      }

      int max = Integer.MIN_VALUE;
      for(Map.Entry<Character,Integer> entry : map.entrySet()){

          if(entry.getValue()>max){
              max = entry.getValue();
          }
      }
      System.out.println("max frequency is - " + max);

      String s1= "abc";
      String s2 = "cab";
        System.out.println("is Anagram - " +isAnagram(s1,s2));


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
