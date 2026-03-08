package questions.arrays.hard;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class OverlappingInterval {

    public static void main(String[] args) {

        List<List<Integer>> intervals = Arrays.asList(
                Arrays.asList(1,4),
                Arrays.asList(4,5)
        );
        int n = intervals.size();
        List<List<Integer>> result = new ArrayList<>();

        intervals.sort(Comparator.comparingInt(a -> a.get(0)));

        for(int i=0; i<n; i++){
            int start = intervals.get(i).get(0);
            int end = intervals.get(i).get(1);

            if(!result.isEmpty() && start <= result.get(result.size()-1).get(1)){
                continue;
            }

            for(int j = i+1; j<n; j++){

                if(intervals.get(j).get(0)<=end){
                    end = Math.max(end, intervals.get(j).get(1));
                }else{
                    break;
                }

            }

           result.add(Arrays.asList(start,end));
        }

       System.out.println(result);
    }


}
