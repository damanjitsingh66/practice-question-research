package questions.arrays.hard;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementN3 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 1, 3, 2,1};
        int n = nums.length/3;
        int max_count = 0;


        for(int i=0; i<nums.length;i++){
             int count = 1;
           for(int j=i+1; j<nums.length;j++){

               if (nums[i] == nums[j]) {
                   count++;
                   max_count=Math.max(max_count,count);
               }

           }


        }
System.out.println(max_count);

    }
}
