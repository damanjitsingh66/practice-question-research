package questions.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FloorAndCeilInArray {


    //Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
   // Result: 4 7
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 10};
        int x= 1;

        List<Integer> result = elements(arr,x);

        System.out.println(result);
    }

    public static List<Integer> elements(int[] arr, int x){

        int floorElement = Integer.MAX_VALUE;
        int ceilElement = Integer.MIN_VALUE;
        int resultantFloor = -1;
        int resultantCeil = -1;

        for (int j : arr) {

            int currentSub = x - j;

            if (currentSub == 0) {
                return Arrays.asList(x, x);
            }

            // ceil
            if (currentSub < 0 && currentSub > ceilElement) {
                ceilElement = currentSub;
                resultantCeil = j;
            }

            // floor
            if (currentSub > 0 && currentSub < floorElement) {
                floorElement = currentSub;
                resultantFloor = j;
            }
        }

        return Arrays.asList(resultantFloor,resultantCeil);

    }

    //tc-O(N)
    //sc-O(N)
}
