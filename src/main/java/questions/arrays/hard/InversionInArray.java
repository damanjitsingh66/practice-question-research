package questions.arrays.hard;

import java.util.*;

public class InversionInArray {

    public static void main(String[] args) {

        int[] arr = {5,3,2,1,4};
        int count =0;
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] < arr[i]){
                    count++;
                }
            }
        }

       System.out.println("inversion sum :- "+ count);

        // tc - O(N)^2
        //sc - O(1)

    }
}
