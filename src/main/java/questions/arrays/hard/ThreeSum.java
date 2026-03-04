package questions.arrays.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ThreeSum {

    //input -  nums = [-1,0,1,2,-1,-4]
    //output  -  [[-1,-1,2],[-1,0,1]]

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
//        nums = [-1,0,1,2,-1,-4]
        int n = nums.length;
        // Total subsets = 2^n
        int totalSubsets = 1 << n; // 2^n
        List<List<Integer>> resultantSubsets = new ArrayList<>();

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();

            // Check each bit
            for (int bit = 0; bit < n; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    subset.add(nums[bit]);
                }
            }
            int sum  = 0;
            for(int i:subset){
                sum = sum + i;
            }

            if(sum == 0 && subset.size()==3){
                boolean alreadyExists = false;

                for (List<Integer> presentSubsets : resultantSubsets) {

                    int presentElementCount = 0;

                    for (Integer element : subset) {
                        for (Integer presentElement : presentSubsets) {
                            if (Objects.equals(element, presentElement)) {
                                presentElementCount++;
                            }
                        }
                    }

                    if (presentElementCount == 3) {
                        alreadyExists = true;
                        break;
                    }
                }

                if (!alreadyExists) {
                    resultantSubsets.add(subset);
                }
              }
         }
        System.out.println(resultantSubsets);
    }
}
//my brute force solution
//Time Complexity	O(n · 2ⁿ)
//Space Complexity	O(n³)