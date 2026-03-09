package questions.arrays.hard;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class MergeTwoSortedArraysWithoutExtraSpace {

    public static void main(String[] args) {

        int[] nums1 = {0, 2, 7, 8, 0, 0, 0};
        int[]  nums2 = {-7, -3, -1};

          //Output : [-5, -3, -2, 1, 4, 5, 8]

        for(int i=0; i<nums2.length;i++){

            int finalI = i;
            if(Arrays.stream(nums1).noneMatch(x-> x== nums2[finalI])){
                int count =0;
                for(int j =0; j< nums1.length;j++){

                    if(count==0 && nums1[j]==0){
                        nums1[j] = nums2[i];
                        count++;
                    }

                }

                }


        }

Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
