package questions.practiceProblems;

public class PalindromString {
    public static void main(String[] args) {
        String a= "abba";

        if(isPalindrome(a)){
            System.out.println("is palindrome");
        }else{
           System.out.println("not a palindrome");
        }
    }
    public static boolean isPalindrome(String a){

        if(a==null) return false;

        a = a.toLowerCase().replaceAll("[^a-z0-9]","");

        boolean result = true;
        //using two pointers
        int left = 0;
        int right = a.length()-1;

        while(left<right){

            if(a.charAt(left)!=a.charAt(right)){
                result= false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }
    //tc-O(N)
    //sc - O(N)
}
