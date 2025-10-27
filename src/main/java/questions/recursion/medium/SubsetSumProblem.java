package workings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetSumProblem {

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n; // 2^n
        List<List<Integer>> ans = new ArrayList<>();

        for (int num = 0; num < subsets; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if ((num & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> result = subsets(arr);
        List<Integer> finalResult = new ArrayList<>();
        for (List<Integer> subset : result) {
            System.out.println(subset);
            int sum = 0;
            for(Integer element:subset){
                sum = sum + element;
            }
            finalResult.add(sum);
        }
        System.out.println(finalResult);
    }

}
