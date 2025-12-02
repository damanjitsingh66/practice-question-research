package questions.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheRepeatingAndMissingNumber {

    public static void main(String[] args) {

        int[] nums = {6, 5, 7, 1, 8, 6, 4, 3, 2};
        Arrays.sort(nums);
       System.out.println(result(nums));

    }
    public static List<Integer> result(int[] nums){

        int repeatingNumber= 0;
        Set<Integer> uniques = new HashSet<>();
        int missing_number = 0;
        int j=1;
        for (int num : nums) {
            if (j <= nums.length - 1) {
                if (num == nums[j]) {
                    repeatingNumber = num;
                }
                j++;
            }
            uniques.add(num);
        }
        for(int k =1; k<=nums.length; k++){
            if(!uniques.contains(k)){
                missing_number = k;
            }
        }
        return List.of(repeatingNumber,missing_number);
    }

}
