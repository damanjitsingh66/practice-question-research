package questions.IQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeNumber {
    public static void main(String[] args) {

        int n = 20;
        int k = 2;

        List<Integer> allPrimes = generatePrimes(n);
        findPrimePairs(allPrimes,k);

    }

    public static void findPrimePairs(List<Integer> primes, int k) {
        Set<Integer> set = new HashSet<>(primes);

        for (int p : primes) {
            if (set.contains(p + k)) {
                System.out.println("(" + p + ", " + (p + k) + ")");
            }
        }
    }




    public static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }


    public static boolean isPrime(int num){

        if(num<2){
            return false;
        }
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;

    }
}
