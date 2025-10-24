package workings;

import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        String s = sc.nextLine();

        // Precompute frequencies
        int[] hash = new int[26]; // Assuming values are in range 0-12
        for (char ch: s.toCharArray()) {
            hash[ch-'a']++;
        }

        // Query section
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            char c = sc.nextLine().charAt(0);
            System.out.println(hash[c-'a']);
        }

        sc.close();

    }
}
