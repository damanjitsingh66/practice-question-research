package questions.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingInterval {

    public static void main(String[] args) {

        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1,4),
                Arrays.asList(4,5)
        );
        List<List<Integer>> result = new ArrayList<>();

        int i=0;
        for(List<Integer> interval : intervals){

            int j=i+1;
            if(j<intervals.size()) {
                if (interval.get(1) >= (intervals.get(j).get(0))) {
                    List<Integer> resultantInterval = Arrays.asList(interval.get(0), intervals.get(j).get(1));
                    result.add(resultantInterval);
                }
            }
            i++;

        }
        System.out.println(result);

    }


}
