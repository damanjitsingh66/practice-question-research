package questions.binarysearch.answer;

import java.util.Arrays;

public class MinimumDaysToMakeBouquets {



    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        System.out.println("minimum days required are : " + minimumDaysRequired(bloomDays,m,k));

    }
    public static boolean isPossible(int[] arr,int day,int k,int m){
        int count = 0;
        int bouquets = 0;

        for(int i=0;i<arr.length; i++){
            if(arr[i]<day){
               count++;
               if(count==k){
                   bouquets++;
                   count =0;
               }
            }else{
                count=0;
            }
        }

        return bouquets>=m;
    }
    public static int minimumDaysRequired(int[] arr, int m, int k){
        int totalBuckets = m*k;
        if(arr.length<totalBuckets) return -1;

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        //this will iterate till min and max values
        for(int day=min;day<=max; day++){
            if(isPossible(arr,day,k,m)){
                return day;
            }

        }
        return -1;
    }

}
