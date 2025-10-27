package workings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class UniqueSubsets {

    static List<List<Integer>> subsets(int[] arr){
        int n = arr.length;
        int subsetLen = 1<<n;

        List<List<Integer>> subsets = new ArrayList<>();

        for(int num=0; num<subsetLen;num++){
            List<Integer> subset = new ArrayList<>();

            for(int i=0;i<n;i++){
                if((num &(1<<i))!=0){
                    subset.add(arr[i]);
                }
            }
            subsets.add(subset);
        }

    return subsets;

    }


    public static void main(String[] args){
        int[] arr = {1,2,2};
     List<List<Integer>> subsets = subsets(arr);
        HashSet<List<Integer>> hashSet = new HashSet<>();
        System.out.println("non unique subsets");
     for(List<Integer> subset:subsets){
         System.out.println(subset);
         hashSet.add(subset);
     }
        System.out.println("unique subsets");
        for(List<Integer> integers: hashSet){
            System.out.println(integers);
        }

    }



}
