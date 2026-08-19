package questions.practiceProblems;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int[] arr) {

        if (arr == null || arr.length <= 1) return;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}

//tc- O(N)
//sc-O(1)
