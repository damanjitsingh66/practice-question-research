package questions.practiceProblems;

public class AppendVowelsInString {

    public static void main(String[] args) {
        String a = "areienkfvciouvce";
        System.out.println(appendVowels(a));
    }
    public static String appendVowels(String a){

        StringBuilder sb= new StringBuilder();
        String vowels = "aeiouAEIOU";

        for(int i=0;i<a.length();i++){
            char ch = a.charAt(i);
            sb.append(ch);

            if(vowels.indexOf(ch)!=-1){
               sb.append(ch);
            }
        }
        return sb.toString();
    }
}

//tc-O(n)
//sc-O(n)