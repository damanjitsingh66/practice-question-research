package questions.stackandqueue.stack.monotonicstack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] res = new int[arr.length];


//        int iterations  = arr.length-1;
//        for(int i=0;i<arr.length;i++){
//            int ind = 0;
//            if(i!= arr.length-1){
//                ind =i+1;
//            }
//            boolean greaterFound = false;
//            for(int j = 1;j<= iterations;j++){
//
//                if(arr[i]<arr[ind]){
//                    res[i]=arr[ind];
//                    greaterFound = true;
//                    break;
//                }else{
//                    ind++;
//                }
//                if(ind>arr.length-1){
//                    ind=0;
//                }
//            }
//            if(!greaterFound){
//                res[i]=-1;
//            }
//        }
//        System.out.println(Arrays.toString(res));
//
//    // brute force  tc - O(n^2) two inner loops && sc - O(N) and one res array is being used



        Deque<Integer> stack = new ArrayDeque<>();
        int n  = arr.length;
        for (int i = 2 * n - 1; i >= 0; i--) {
            int currentVal = arr[i % n];

            while (!stack.isEmpty() && stack.peek() <= currentVal) {
                stack.pop();
            }

            if (i < n) {
                res[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(currentVal);
        }
        System.out.println(Arrays.toString(res));


        // in this approach we will iterate twice first store all the elements in the stack and when we again try to iterate in second circle then it will take maximum one and compare all of them with it so that's why it wil give
        //us the time complexity of tc - O(N) and sc = O(N)

    }
}
