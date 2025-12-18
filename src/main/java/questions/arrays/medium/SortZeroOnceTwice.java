package questions.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortZeroOnceTwice {

    public static void main(String[] args) {

        int[] arr = {0,1,2,1,0,1,2,1};
        int n= arr.length;

        //brute force
//        List<Integer> result_list = new ArrayList<>();
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                result_list.add(arr[i]);
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==1){
//                result_list.add(arr[i]);
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==2){
//                result_list.add(arr[i]);
//            }
//        }
//
//        System.out.println(result_list);

        //tc->O(N) sc->O(1)
        int low =0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
