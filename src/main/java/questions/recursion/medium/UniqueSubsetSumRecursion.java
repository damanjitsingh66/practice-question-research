package workings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSubsetSumRecursion {


    public static void main(String[] args) {
        // Sample input
//        int[] candidates = {10,1,2,7,6,1,5};
//        int target = 8;

        int[] candidates = {2,5,2,1,2};
        int target = 5;

        Set<List<Integer>> result = combinationSum(candidates, target);

        // Print the result
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }

    private static void findCombinations(int ind, int[] arr, int target, Set<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind+1, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }

        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public static Set<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> ans = new HashSet<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}
