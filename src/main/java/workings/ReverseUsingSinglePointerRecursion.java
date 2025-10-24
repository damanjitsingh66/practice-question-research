package workings;

import java.util.Arrays;

public class ReverseUsingSinglePointerRecursion {
//single pointer approach
    public static void main(String[] args){

        int[] arr ={2,3,4,5,6,7};
        reverse(0,arr);

    }
    static void reverse(int i,int[] arr){
        if(i>=(arr.length-1)/2){
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(i,arr.length-1-i,arr);
        reverse(i+1,arr);
    }

    static void swap(int l, int r,int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }


}
