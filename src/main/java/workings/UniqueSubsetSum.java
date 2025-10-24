package workings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueSubsetSum {
    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        int n = arr.length;
        int target = 7;

        List<List<Integer>> list = new ArrayList<>();

        // Start from each element in array
        for (int i = 0; i < n; i++) {
            List<Integer> subList = new ArrayList<>();
            int sum = 0;
            int index = i;  // keep index separate from outer loop

            while (sum < target) {
                sum += arr[index];
                subList.add(arr[index]);

                if (sum == target) {
                    list.add(new ArrayList<>(subList)); // add a copy of subList
                    break;
                }

                index = (index + 1) % n; // rotate through array
            }

            System.out.println("Sum = " + sum);
            if (sum != target) {
                System.out.println("lesser");
            }
        }

        System.out.println("Combinations that sum to target:");
        for (List<Integer> sub : list) {
            System.out.println(sub);
        }
    }

}
