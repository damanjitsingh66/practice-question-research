package workings;

import java.util.Arrays;

public class ReverseUsingFunctionalRecursion {

    public static void main(String[] args){

        int[] arr ={2,3,4,5,6,7};
        reverse(0,arr.length-1,arr);

    }
    static void reverse(int l,int r,int[] arr){
        if(l>=r){
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(l,r,arr);
        reverse(l+1,r-1,arr);
    }

    static void swap(int l, int r,int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
