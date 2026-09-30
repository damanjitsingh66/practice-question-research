package questions.practiceProblems.unthinkablesolutions;

import java.util.Objects;
import java.util.Scanner;

public class QuestionMatch {


    public static int matcher(String str1,String str2) {
        int result = 0;
        String star = "*";

        if (str2.equals(str1)) {
           return 1;
        }

        if (str2.contains("?")) {

            result = questionMatch(str1, str2);
        }

        if (!Objects.equals(str1, str2)) {
            return 0;
        }
        return result;
    }
    public static int questionMatch(String s1, String s2){

        if(s1.length()!=s2.length()){
            return 0;
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='?'){
                continue;
            }
            if(s1.charAt(i)!=s2.charAt(i)){
               return 0;
            }

        }
        return 1;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int output = matcher(str1,str2);
        System.out.println(output);
    }
}
