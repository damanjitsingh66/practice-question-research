package questions.arrays.medium;

public class StockBuyAndSell {

    public static void main(String[] args) {

        //brute force approach
//        int[] arr = {5, 3, 6, 1, 4};
//        int max = 0;
//        int diff = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                diff = arr[j] - arr[i];
//                if (diff > max) {
//                    max = diff;
//                }
//            }
//        }
//        System.out.println("maximum profit is - " + max);






//optimize solution

        int[] arr = {5, 3, 6, 1, 4};
        int profit = 0;
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            int cost  = arr[i] - min;
            profit = Math.max(profit,cost);
            min = Math.min(arr[i],min);
        }
       System.out.println("maximum profit is - " + profit);
    }

    //time complexity - O(n)
    //space complexity - O(1)
    }











