package questions.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FloorAndCeilInArray {


    //Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
   // Result: 4 7
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 10};
        int x= 9;

        List<Integer> result = elements(arr,x);

        System.out.println(result);
    }

    public static List<Integer> elements(int[] arr, int x){

        int floorElement = x - arr[0];
        int ceilElement = x - arr[arr.length-1];
        int resultantCeil = 0;
        int resultantFloor = 0;

        for(int i =1; i<arr.length;i++){

            int currentSub = x - arr[i];
            if(currentSub==0 || floorElement==0 || ceilElement==0){
                resultantCeil = x;
                resultantFloor = x;
                break;
            }

            if(currentSub>=ceilElement && currentSub<0){
                ceilElement = currentSub;
                resultantCeil  = arr[i];

            }
            if(floorElement>currentSub && currentSub>0){
                floorElement = currentSub;
                resultantFloor = arr[i];
            }
        }
        return Arrays.asList(resultantFloor,resultantCeil);

    }

    //tc-O(N)
    //sc-O(N)
}
