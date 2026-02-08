package questions.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {10, 22, 12, 3, 0, 6};
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        int max = 0;

        for(int i=n-1; i>=0; i--){
            if(arr[i]>max){
                res.add(arr[i]);
            }
            max = Math.max(arr[i],max);
        }

        System.out.println(res);
    }
}
