package questions.Strings;

public class AnagramString {

    public static void main(String[] args) {

        String s = "CAT";
        String t = "ATC";

    System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'A']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }

        return true;
    }
}
