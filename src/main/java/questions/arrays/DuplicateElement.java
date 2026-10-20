package questions.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElement {

    public static void main(String[] args) {

        int[] arr ={1,5,2,2,2,2,2,3,2,4,5,6};

        Arrays.sort(arr);

//        HashSet<Integer> duplicates = new HashSet<>();
//
//        for(int i=0;i<arr.length-1;i++){
//
//            if(arr[i] == arr[i+1]){
//                duplicates.add(arr[i]);
//            }
//        }
//        System.out.println(duplicates);   //mine tc - O(n log n), sc - O(n)

        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int i=0;i< arr.length;i++){
            if(!visited.add(arr[i])){
                duplicates.add(arr[i]);
            }
        }
        System.out.println(duplicates);  //optimized tc - O(N),sc- O(n)
    }
}
