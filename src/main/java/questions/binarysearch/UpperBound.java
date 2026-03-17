package questions.binarysearch;

public class UpperBound {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,8};
        int k = 5;
     System.out.println(element(arr,k));

    }

    public static int element(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<=high){
            int mid = (low + high)/2;

            if(arr[mid]>k){
                ans=mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
       return ans;
           }

           //tc - O(N) and //sc - O(1)
}
