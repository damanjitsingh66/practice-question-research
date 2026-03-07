package questions.arrays.hard;

import javax.print.attribute.standard.PresentationDirection;
import java.util.*;

public class FourSumWithTarget {

    public static void main(String[] args) {

        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){

                for(int k=j+1; k<arr.length; k++){

                    for(int l=k+1; l<arr.length; l++){

                        long sum = arr[i]+ arr[j];
                        sum += arr[k];
                        sum += arr[l];

                        if(sum==target){
                         List<Integer> subset = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                         result.add(subset);
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
