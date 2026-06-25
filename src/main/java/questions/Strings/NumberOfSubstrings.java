package questions.Strings;

public class NumberOfSubstrings {
    public static void main(String[] args) {

        String s = "pqpqs";
        int n = s.length();

        // 2^n combinations
        for (int mask = 0; mask < (1 << n); mask++) {

            StringBuilder subset = new StringBuilder();

            // Print binary representation
            for (int i = 0; i < n; i++) {
                int bit = (mask >> (n - 1 - i)) & 1;
                System.out.print(bit + " ");

                if (bit == 1) {
                    subset.append(s.charAt(i));
                }
            }

            System.out.println(" -> \"" + subset + "\"");
        }




    }
}
