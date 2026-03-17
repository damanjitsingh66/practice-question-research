package questions.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatingAndMissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,5,4,1,6,1,7};
        //output -{1,2}

        long n = nums.length;

        // Sum of first n natural numbers
        long SN = (n * (n + 1)) / 2;

        // Sum of squares of first n natural numbers
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        // Calculate actual sum (S) and sum of squares (S2) of array elements
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * (long) nums[i];
        }
        // Compute the difference values
        long val1 = S - SN; // X - Y

        // S2 - S2n = X^2 - Y^2
        long val2 = S2 - S2N;

        // Calculate X + Y
        val2 = val2 / val1;

        // Calculate X and Y
        long x = (val1 + val2) / 2; // repeating
        long y = x - val1;          // missing

        System.out.println(Arrays.asList(x,y));
        //Complexity

        //Time: O(n)

        //Space: O(1)

    }
}
