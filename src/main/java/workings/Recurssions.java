package workings;

public class Recurssions {



//    public static void printName(int i, int n) {
//        if (i >= n) {
//            return; // Base case: stop when i reaches n
//        }
//        System.out.println("Alice");
//        printName(i + 1, n); // Recursive call with i+1
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        printName(0, n); // Start from i = 0
//    }

//    public static void printNumbers(int i, int n) {
//        if (i >= n) {
//            return; // Base case: stop when i reaches n
//        }
//        System.out.println(i);
//        printNumbers(i + 1, n); // Recursive call with i+1
//    }
//
//    public static void main(String[] args) {
//        int n = 6;
//        printNumbers(1, n); // Start from i = 0
//    }

//    public static void printNumbers(int i, int n) {
//        if (i == n) {
//            return; // Base case: stop when i reaches n
//        }
//        System.out.println(n);
//        printNumbers(i , n-1); // Recursive call with i+1
//    }
//
//    public static void main(String[] args) {
//        int n = 6;
//        printNumbers(0, n); // Start from i = 0
//    }

    public static void printNumbers(int i, int n) {
        if (i < 1) {
            return; // Base case: stop when i reaches n
        }

        printNumbers(i-1 , n); // Recursive call with i+1
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n = 6;
        printNumbers(n, n); // Start from i = 0
    }

}
