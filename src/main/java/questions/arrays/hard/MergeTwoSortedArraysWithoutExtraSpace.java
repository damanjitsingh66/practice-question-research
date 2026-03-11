package questions.arrays.hard;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class MergeTwoSortedArraysWithoutExtraSpace {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;      // last element in nums1
        int j = n - 1;      // last element in nums2
        int k = m + n - 1;  // last position of nums1

        // compare elements from end
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // if nums2 still has elements
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {0, 2, 7, 8, 0, 0, 0};
        int[] nums2 = {-7, -3, -1};

        int m = 4; // valid elements in nums1
        int n = 3; // elements in nums2

        merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));
    }
}
