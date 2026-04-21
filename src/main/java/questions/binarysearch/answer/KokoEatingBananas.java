package questions.binarysearch.answer;

import java.util.Arrays;

import static java.lang.Math.ceil;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] arr = {7, 15, 6, 3};
        int n  = arr.length;
        int hours = 8;

        System.out.println(bananasToBeEated(arr,hours));

    }

    public static int calculateHours(int[] arr, int speed){
         int totalH =0;
        for(int bananas : arr){

            totalH += (int)Math.ceil((double)bananas / speed);
        }
        return totalH;
    }

    public static int bananasToBeEated(int[] arr, int hours){
        int max_ele = Arrays.stream(arr).max().getAsInt();
        int low = 0;
        int high =max_ele;
        int ans = max_ele;

        while(low<=high){
            int mid  = (low + high)/2;
            int calculatedHours = calculateHours(arr,mid);

            if(calculatedHours<=hours){
               high = mid -1;
               ans = mid;
            }else{
                low = mid + 1;
            }

        }

    return ans;

    }

    //tc - O(N log n Max(arr[]))
    //sc - O(1)
}
