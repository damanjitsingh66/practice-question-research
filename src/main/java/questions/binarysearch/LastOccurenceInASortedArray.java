package questions.binarysearch;

public class LastOccurenceInASortedArray {

    public static void main(String[] args) {

        int[] arr = {3, 4, 13, 13, 13, 20, 40};
        int target = 13;
        //output - 2 at second index the first occurrence of element occurs
        System.out.println(elementAtIndex(arr,target));
    }
    public static int elementAtIndex(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;
        int ans = -1;

        while(low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]==target){
              ans = mid;
                low = mid + 1;
            }
            if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    //tc- O(n log n)
    //sc -O(1)
}
