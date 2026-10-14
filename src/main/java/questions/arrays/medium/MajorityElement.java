package questions.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,3,3,2};
        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();

        for (int j : arr) {

//            map.put(j, map.getOrDefault(j, 0) + 1);
             map.merge(j,1,Integer::sum);
        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        System.out.println(maxEntry.getKey());

    }

}
