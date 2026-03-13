package questions.arrays.hard;

public class MaximumProductInSubarray {
    public static void main(String[] args) {

        int[] org = {1, 2, 3, 4, 5, 0};
        int n = org.length;

        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int prod = 1;

            for (int j = i; j < n; j++) {
                prod = prod * org[j];
                res = Math.max(res, prod);
            }
        }

        System.out.println(res);
    }
}
