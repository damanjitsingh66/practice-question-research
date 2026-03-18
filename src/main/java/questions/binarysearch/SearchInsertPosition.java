package questions.binarysearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 1;
        System.out.println("insert index element - "+ insertIndex(arr,target));
    }
    public static int insertIndex(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]>=target){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
     return ans;
    }
    //tc-O(log n)
    //sc-O(1)
}
