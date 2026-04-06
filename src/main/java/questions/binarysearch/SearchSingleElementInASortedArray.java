package questions.binarysearch;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SearchSingleElementInASortedArray {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};

        int n = arr.length-1;

        Map<Integer,Integer> elementWithCount = new HashMap<>();


        for(int i=0; i<=n; i++){

        if(elementWithCount.containsKey(arr[i])){
            elementWithCount.put(arr[i],elementWithCount.get(arr[i]) + 1);
        }
        else{
            elementWithCount.put(arr[i], 1);
        }

        }
        int minKey = Collections.min(elementWithCount.entrySet(),
                (a, b) -> a.getValue() - b.getValue()).getKey();

        System.out.println(minKey);

    }
}
