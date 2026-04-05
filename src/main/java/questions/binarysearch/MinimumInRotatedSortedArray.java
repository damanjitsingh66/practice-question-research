package questions.binarysearch;

public class MinimumInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {3,4,5,0,1,2};

        System.out.println("output - " + minimumRotatedSortedArray(arr));

    }
//tc- O(log N)
    //sc - O(1)
    public static int minimumRotatedSortedArray(int[] arr){
        int low  = 0;
        int high = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[low]<arr[mid]){
                min =  Math.min(min,arr[low]);
                low = mid + 1;
            }
            else{
              min = Math.min(min,arr[mid]);
              high = mid - 1;
            }

        }
        return min;
    }





}
