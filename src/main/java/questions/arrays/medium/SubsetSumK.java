package questions.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumK {

    public static void main(String[] args) {
//mine approach
        int[] nums = {3, 1, 2, 4};
        int n = nums.length;
        int k = 6;

        // Total subsets = 2^n
        int totalSubsets = 1 << n; // 2^n

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();
             int sum =0;
            // Check each bit
            for (int bit = 0; bit < n; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    subset.add(nums[bit]);
                }
            }

            for(Integer i : subset){
                sum = sum + i;
            }
            if(sum == k){
                System.out.println(subset);
            }



        }
        }
}
