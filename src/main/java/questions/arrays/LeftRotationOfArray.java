package questions.arrays;

import java.util.Arrays;

public class LeftRotationOfArray {

    public static void main(String[] args) {

        //tc = O(N) and sc = O(N) we are using extra space of O(1)
     int[] arr = {1,2,3,4,5};
     int n= arr.length;
     int[] temp = new int[1];
     temp[0]=arr[0];
     for(int i=1;i<n;i++){
         arr[i-1] = arr[i];
     }
    arr[n-1] = temp[0];

     System.out.println(Arrays.toString(arr));

    }



}
