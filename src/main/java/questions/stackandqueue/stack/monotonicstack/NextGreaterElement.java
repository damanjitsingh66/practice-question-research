package questions.stackandqueue.stack.monotonicstack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {

    public static void main(String[] args) {

        int[] arr = {4, 5, 2, 10, 8};
        int[] res = new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//
//            int targetIndex = i+1;
//            while(targetIndex<arr.length && arr[i]>=arr[targetIndex]){
//
//                targetIndex++;
//            }
//
//            if(targetIndex==arr.length){
//                arr[i]= -1;
//            }
//            else{
//                arr[i] = arr[targetIndex];
//            }
//        }
//
//        System.out.println(Arrays.toString(arr));
//
    //brute force my
    //O(n^2 solution)


        Deque<Integer> stack = new ArrayDeque<>();
        //iterate right to left
        for (int i=arr.length-1;i>=0;i--){
            //use decreasing order of the monotonic stack
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }

            res[i] = stack.isEmpty()?-1:stack.peek();

            stack.push(arr[i]);
        }
            System.out.println(Arrays.toString(res));
        //o(n) solution
    }

}
