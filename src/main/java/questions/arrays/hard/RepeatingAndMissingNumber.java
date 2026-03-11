package questions.arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class RepeatingAndMissingNumber {

    public static void main(String[] args) {

        int[] nums = {3,5,4,1,6,1,7};
        //output -{1,2}

        int n = nums.length;
        boolean[] visited = new boolean[n+1];

        List<Integer> result = new ArrayList<>();

        int repeated = -1;
        int missing = -1;

        for(int i=0; i<nums.length;i++){
            if(visited[nums[i]]){
                repeated = nums[i];
            }
            else{
                visited[nums[i]] = true;
            }
        }
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                missing = i;
                break;
            }
        }
        result.add(repeated);
        result.add(missing);

        System.out.println(result);

        //Complexity

        //Time: O(n)

        //Space: O(n)

    }
}
