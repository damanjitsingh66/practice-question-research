package questions.arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {1,3,6,7};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));
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



//tc-O(n) and sc-O(n)

        }

        public static int[] twoSum(int[] arr, int target){

            Map<Integer,Integer> map = new HashMap<>() ;
            for(int i=0; i<arr.length;i++){

                int ele = target - arr[i];
                if(map.containsKey(ele)){
                    return new int[]{map.get(ele),i};
                }
               map.put(arr[i],i);

            }

        return new int[]{};
        }





}
