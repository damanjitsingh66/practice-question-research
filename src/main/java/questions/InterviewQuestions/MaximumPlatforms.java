package questions.InterviewQuestions;

import java.util.Arrays;

public class MaximumPlatforms {

    public static int findPlatforms(int[] arr, int[] dep) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;
        int platforms = 0, maxPlatforms = 0;

        while (i < arr.length) {

            if (arr[i] <= dep[j]) {
                platforms++;   // train arrived
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;   // train departed
                j++;
            }
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {

        int[] arr = {900, 915, 1000};
        int[] dep = {930, 945, 1030};

        System.out.println(findPlatforms(arr, dep));
    }
}






