package questions.arrays.hard;

import java.util.*;

public class ThreeSum {

    //input -  nums = [-1,0,1,2,-1,-4]
    //output  -  [[-1,-1,2],[-1,0,1]]

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
//        nums = [-1,0,1,2,-1,-4]
        int n = nums.length;

        Set<List<Integer>> sets = new HashSet<>();

        for(int i=0; i<n;i++){

            for(int j= i+1; j<n;j++){

                for(int k = j+1; k<n; k++){

                    if (nums[i] + nums[j] + nums[k]==0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        sets.add(triplet);

                    }
                }
            }
        }
        System.out.println(sets);
    }
}

//1. Time Complexity:O(n^3. log3)
//Space Complexity: O(2.M)