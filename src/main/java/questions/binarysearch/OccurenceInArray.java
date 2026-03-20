package questions.binarysearch;

import java.util.List;

public class OccurenceInArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,3,4};
        int x= 3;
      int firstOcc = FirstOccurrenceInArray(arr,x);
      int lastOcc = LastOccurrenceInArray(arr, x);

      if(firstOcc==-1 || lastOcc ==-1){

      }


    }
    public static int LastOccurrenceInArray(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int ans = -1;

        while(low<=high){

            int mid = (low + high) / 2;
            if(arr[mid]== target){
               ans = mid;
               low = mid + 1;
            }
            if(arr[mid]<target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }
        return ans;
    }

    public static int FirstOccurrenceInArray(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        int ans = -1;

        while(low<=high){

            int mid = (low + high) / 2;
            if(arr[mid]== target){
                ans = mid;
                high = mid -1;
            }
            if(arr[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }

        }
        return ans;
    }




}

