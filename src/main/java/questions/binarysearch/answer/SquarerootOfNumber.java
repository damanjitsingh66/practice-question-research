package questions.binarysearch.answer;

public class SquarerootOfNumber {

    public static void main(String[] args) {

        int n = 28;
        int result = 0;
       for(int i=0; i*i<=n;i++){
           result = i;
       }
       System.out.println(result);

       //my brute force solution
        //tc- O(√n)
        //sc-O(1)

    }

}

