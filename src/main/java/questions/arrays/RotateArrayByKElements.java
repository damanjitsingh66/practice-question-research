package questions.arrays;

import java.util.Arrays;

public class RotateArrayByKElements {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int k=3;
        //my brute force logic
//        int[] temp = new int[k];
//        for(int i=0; i<k;i++){
//            temp[i]=arr[i];
//        }
//        for(int j=k; j<n;j++){
//            arr[j-k]= arr[j];
//        }
//        int len = n-k;
//        for(int z=0; z<temp.length;z++){
//            arr[len] = temp[z];
//            len++;
//        }
//        System.out.println(Arrays.toString(arr));


        // In case k > n
        k = k % n;

        // Reverse first k elements
        reverse( 0, k - 1,arr);

        // Reverse remaining elements
        reverse( k, n - 1,arr);

        // Reverse entire array
        reverse(0, n - 1,arr);
  System.out.println(Arrays.toString(arr));

    }
     public static void reverse(int start, int end, int[] arr){
         while (start < end) {
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
     }

}
