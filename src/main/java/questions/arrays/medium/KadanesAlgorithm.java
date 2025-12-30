package questions.arrays.medium;

public class KadanesAlgorithm {

    public static void main(String[] args) {
//my first
////        int[] nums = {-2,-3,-7,-2,-10,-4};
//        int[] nums = {2,3,5,-2,1,-4};
//        int max = nums[0];
//        int sum = 0;
//        for(int i=0; i<nums.length; i++){
//            sum = sum + nums[i];
//            if(sum > max){
//                max = sum;
//            }
//        }
//        System.out.println(max);
//brute force
//        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int n = arr.length;
//
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int sum = 0;
//
//                for (int k = i; k <= j; k++) {
//                    sum += arr[k];
//                }
//
//                maxSum = Math.max(maxSum, sum);
//            }
//        }
//
//        System.out.println("Maximum Subarray Sum = " + maxSum);

        //better one
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                    sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);



    }
}
