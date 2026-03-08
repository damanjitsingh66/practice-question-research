package questions.arrays.hard;

import javax.print.attribute.standard.PresentationDirection;
import java.util.*;

public class FourSumWithTarget {

    public static void main(String[] args) {
//
//        int[] arr = {1,0,-1,0,-2,2};
//        int target = 0;
//        Set<List<Integer>> result = new HashSet<>();
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=i+1; j<arr.length; j++){
//
//                for(int k=j+1; k<arr.length; k++){
//
//                    for(int l=k+1; l<arr.length; l++){
//
//                        long sum = arr[i]+ arr[j];
//                        sum += arr[k];
//                        sum += arr[l];
//
//                        if(sum==target){
//                         List<Integer> subset = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                         result.add(subset);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(result);



        int[] arr = {1,0,-1,0,-2,2};
        int target = 0;
        int n = arr.length;

        List<List<Integer>> res = fourSum(arr, n,target);

       System.out.println(res);
    }

    public static List<List<Integer>> fourSum(int[] arr, int n, int target) {
        // Sort the array
        Arrays.sort(arr);
        // Store final result
        List<List<Integer>> ans = new ArrayList<>();

        // First loop for first element
        for (int i = 0; i < n; i++) {
            // Skip duplicates for first element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for(int j=i+1;j<n;j++) {
                // Two pointers
                if (j!=i+1 && arr[j] == arr[j - 1]) continue;
                int left = j + 1, right = n - 1;

                // Find pairs for current arr[i]
                while (left < right) {
                    int sum = arr[i] + arr[j]+ arr[left] + arr[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(arr[i], arr[j],arr[left], arr[right]));
                        left++;
                        right--;

                        // Skip duplicates for left
                        while (left < right && arr[left] == arr[left - 1]) left++;
                        // Skip duplicates for right
                        while (left < right && arr[right] == arr[right + 1]) right--;
                    } else if (sum < 0) left++;
                    else right--;
                }
            }
        }
        return ans;
    }


}
