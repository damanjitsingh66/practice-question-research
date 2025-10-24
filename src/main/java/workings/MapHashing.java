package workings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read n and the array elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequencies using a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Read number of queries
        int q = sc.nextInt();

        // Process each query
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(freqMap.getOrDefault(number, 0));
        }

        sc.close();
    }
}
