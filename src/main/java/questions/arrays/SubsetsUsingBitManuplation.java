package questions.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetsUsingBitManuplation {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int n = nums.length;

        // Total subsets = 2^n
        int totalSubsets = 1 << n; // 2^n

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();

            // Check each bit
            for (int bit = 0; bit < n; bit++) {
                if ((mask & (1 << bit)) != 0) {
                    subset.add(nums[bit]);
                }
            }

            System.out.println(subset);
        }
        //Time: O(n × 2^n)
        //for outer loop 2^n
        //for inner loop n
        //Space: O(n) for each subset
        //from List<Integer> subset = new ArrayList<>();
    }
}
