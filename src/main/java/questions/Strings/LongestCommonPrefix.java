package questions.Strings;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("flower", "flow", "flight");

        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }

    private static String longestCommonPrefix(List<String> arr) {

        if (arr == null || arr.isEmpty()) {
            return "";
        }

        String prefix = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            String current = arr.get(i);

            while (!current.startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}