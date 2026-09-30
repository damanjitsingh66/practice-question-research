package questions.stackandqueue.stack.monotonicstack;

import java.util.Stack;

public class MinimumContiguousSubarray {
//    public static void main(String[] args) {
//
//        int[] arr = {3, 1, 2, 5};
//
//        //output - 10
//        //subsets - [2],[3],[1],[2,3],[3,1],[2,3,1] = 2+3+1+2+1+1 = 10
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//
//                int minimum = Integer.MAX_VALUE;
//                for (int k = i; k <= j; k++) {
//
//                    if(arr[k]<minimum){
//                        minimum = arr[k];
//                    }
////                    System.out.print(arr[k] + (k < j ? ", " : ""));
//                }
//               sum += minimum;
//            }
//        }
//        System.out.println(sum);
//    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5};
        System.out.println(sumSubarrayMins(arr)); // Output: 10
    }

    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // 1. Find the distance to the Previous Less Element (PLE)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // 2. Find the distance to the Next Less Element (NLE)
        // Using >= on one side and > on the other handles duplicate elements safely
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // 3. Calculate total sum
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long ways = (long) left[i] * right[i];
            sum += ways * arr[i];
        }

        return (int) sum;
    }


}
