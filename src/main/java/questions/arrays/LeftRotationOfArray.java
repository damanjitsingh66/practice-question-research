package questions.arrays;

import java.util.Arrays;

public class LeftRotationOfArray {

    public static void main(String[] args) {
        //tc = O(N) and sc = O(N) we are using extra space of O(1)
     int[] arr = {1,2,3,4,5};
     int n= arr.length;
     int k =2;
     int[] temp = new int[k];
     int id = 0;
     for(int i=n-k;i<n;i++){
         temp[id]=arr[i];
         id++;
     }
     for(int i=n-1;i>=k;i--){
         arr[i] = arr[i-k];

     }
     for(int i=0;i<k;i++){
         arr[i] = temp[i];
     }
     System.out.println(Arrays.toString(arr));

    }
}
