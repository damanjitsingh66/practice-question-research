package questions.random;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        int[] nums = {1,2,3,4};

       int[] res = productExceptSelf(nums);
       System.out.println(Arrays.toString(res));
    }

    public static int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] res = new int[nums.length];

        // 1. Store product of everything to the LEFT
        int leftProduct = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // 2. Multiply by product of everything to the RIGHT
        int rightProduct = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }
}

