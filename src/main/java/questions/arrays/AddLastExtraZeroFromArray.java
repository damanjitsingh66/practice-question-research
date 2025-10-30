package questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddLastExtraZeroFromArray {

    public static void main(String[] args) {



        //brute force solution
        //tc= O(2n)
        //sc= O(n)
        int[] arr ={1,3,4,0,5,0,6,0,7};
        int n = arr.length;
        List<Integer> temp = new ArrayList<>();

        for (int j : arr) {
            if (j != 0) {
                temp.add(j);
            }
        }
        int nk = temp.size();
        for(int i=0; i<nk; i++){
                arr[i]=temp.get(i);
        }

        for(int i=nk; i<arr.length; i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

}
