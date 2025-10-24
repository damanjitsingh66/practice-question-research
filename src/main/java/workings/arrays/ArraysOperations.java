package workings.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysOperations {

    //Time Complexity = O(n)
    //Space Complexity = O(1)
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = removeDuplicatesOptimalSolution(arr);
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static int removeDuplicatesOptimalSolution(int [] arr){
     int i=0;
        for(int j=0; j<arr.length;j++){
           if(arr[j]!=arr[i]){
               arr[i+1]=arr[j];
                  i++;
           }
        }
      return i+1;
    }
}
