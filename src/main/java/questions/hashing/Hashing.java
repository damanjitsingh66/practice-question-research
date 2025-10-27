package workings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array values
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequencies
        int[] hash = new int[1000000000]; // Assuming values are in range 0-12
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        // Query section
        int q = sc.nextInt();
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }

        sc.close();

    }

}
