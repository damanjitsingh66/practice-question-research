package questions.binarysearch;

import java.util.Arrays;
import java.util.List;

public class FloorAndCeilInArray {


    //Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
   // Result: 4 7
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 8, 10};
        int x= 5;
        System.out.println("floor - " + floorInArray(arr,x) + " ceil - "+ ceilInArray(arr,x));
    }

    public static int ceilInArray(int[] arr,int x){

        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>=x){
                ans = arr[mid];
                high = mid - 1;
            }
            else{
               low = mid + 1;
            }
        }
      return ans;
    }

    public static int floorInArray(int[] arr,int x){

        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]<=x){
                ans = arr[mid];
                low = mid + 1;

            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    //tc-O(log n)
    //sc-O(1)
}
