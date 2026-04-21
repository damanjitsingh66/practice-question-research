package questions.binarysearch.answer;

import java.util.Arrays;

public class SmallestDivisorGivenAThreadShold{
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int limit = 8;
        //output must be 3
        // 1/3 = 1, 2/3=1, 3/3=1, 4/3=2, 5/3=2 -> (1,1,1,2,2) -> 7

       for(int i=0;i<arr.length;i++){

           int count = 0;
           int max_count=Integer.MIN_VALUE;
           for(int j=0; j<arr.length;j++){

               int div= arr[j]/arr[i];
               int rem = arr[j]%arr[i];
               if(div!=0){
                   count = count + div;
               }else{
                   count++;
               }
               if(rem!=0){
                   count++;
               }
               if(max_count<count && count<limit){
                   max_count=count;
               }
           }
       }



    }
}
