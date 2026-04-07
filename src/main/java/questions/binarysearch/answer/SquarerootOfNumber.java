package questions.binarysearch.answer;

public class SquarerootOfNumber {

    public static void main(String[] args) {

        int n = 1000;
        long result = 0;

        long low = 1;
        long high  = n/2;


        while(low<high){

            long mid = (low + high)/2;
            if(mid*mid<=n){
                result =  mid;
                low =  mid + 1;

            }
            else{
                high = mid -1;
            }
        }
        System.out.println(result);



//tc-O(log n)
        //sc - O(1)

    }

}

