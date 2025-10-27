package workings;

import java.util.Arrays;
import java.util.Scanner;

public class HashingQuestion {
    //find the minimum and maximum frequent number in the array
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int[] hash = new int[10000];
        for(int i=0; i<n;i++){
            hash[arr[i]]++;
        }

        int max = Arrays.stream(hash).max().getAsInt();
        int min = Arrays.stream(hash).min().getAsInt();

        System.out.println("max element in frequency is :- "+ max + "min element in frequency is :- " +min);
    }

}
