package questions.binarysearch;

public class LowerBound {

    public static void main(String[] args) {

        int[] arr ={1,3,4,6,6,7,8};

        int k = 8;

        System.out.println(element(arr,k));

    }

    public static int element(int[] arr, int k){

        int left = 0;
        int right = arr.length-1;
        int ans = arr.length;


        while(left<=right){
            int mid = (left + right) / 2;
            if(arr[mid] >=k){
                ans = mid;
                right = mid - 1;

            }
            else{
                left = mid + 1;
            }
        }

        return ans;
    }

    //tc- O( log n ), sc - O(1)
}
