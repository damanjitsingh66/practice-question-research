package questions.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,3,3,2};
        int n = arr.length;
        int mid = n/2;

        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        for (int i=0; i<n;i++) {

            if(map.get(arr[i])==null){
                count =0;
                map.put(arr[i], count++);
            }

            for(int j=i+1;j<n;j++){
                if (arr[i] == arr[j]) {
                    map.put(arr[i], count++);
                }
            }

        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }


    }

}
