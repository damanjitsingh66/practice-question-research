package questions.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("flower","flow","flight");

        String result = longestCommonPrefix(arr);
        System.out.println(result);
    }

    private static String longestCommonPrefix(List<String> arr){
        String first_ele = arr.get(0);
        String longestCommonPrefix = "";


            for(int j =1; j<arr.size();j++){

                String other_ele = arr.get(j);

                for(int k = 0; k<other_ele.length();k++){
                    int repeat_count = 1;
                    for(int i=k;i<first_ele.length();i++){
                    if(first_ele.charAt(i)==other_ele.charAt(k)){
                        repeat_count++;
                        if(repeat_count==arr.size()){
                            longestCommonPrefix = longestCommonPrefix + first_ele.charAt(i);
                        }
                    }
                    else{
                        break;
                    }
                }

            }
        }
        if(longestCommonPrefix.length()>1){
            return longestCommonPrefix;
        }
       else{
           return null;
        }
    }
}
