package questions.arrays.medium;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1,3,6,7};
        int target = 9;
  //brute force approach
        //tc->O(N^2), sc->O(N)
//        for(int i=0;i<arr.length;i++){
//
//            for(int j=i+1;j<arr.length; j++){
//
//                if(arr[i]+arr[j]==target){
//                    System.out.println("{ "+arr[i]+" , "+arr[j]+" }");
//                }
//            }
//        }

        //optimizic approach
        int left=0,right=arr.length-1;
        Arrays.sort(arr);
        while(left<right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left] + ","+arr[right]);
                break;
            } else if (sum < target) left++;
            else right--;
        }

//tc-O(n) and sc-O(1)

        }





}
