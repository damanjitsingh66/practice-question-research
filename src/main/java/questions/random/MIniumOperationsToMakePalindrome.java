package questions.random;

public class MIniumOperationsToMakePalindrome {

    public static void main(String[] args) {

        int[] nums = {10,12,14,16};

        int operations =  0;
        int number = 2;

        for (int orgNumber : nums) {

            int positiveOperations = 0;
            int negativeOperations = 0;
            int positiveNumber = orgNumber;
            int negativeNumber = orgNumber;

            while (!isPalindrome(positiveNumber)) {
                positiveNumber += number;
                positiveOperations++;
            }
            while (negativeNumber > 0 && !isPalindrome(negativeNumber)) {
                negativeNumber -= number;
                negativeOperations++;
            }
            if(negativeNumber <= 0){
                operations += positiveOperations;
            } else{
                operations += Math.min(positiveOperations,negativeOperations);
            }
        }

     System.out.println("Minimum operations are - " + operations);
    }

    //tc - O(N)
    public static boolean isPalindrome(int n){
        if(n<0) return false;
        int org = n;
        int rev = 0;

        while(org>0){
            int rem = org%10;
            rev = rem + rev*10;
            org = org/10;
        }
        return rev==n;
    }
}
//great you done it man - self