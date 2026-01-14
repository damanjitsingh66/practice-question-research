package questions.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {

    public static void main(String[] args) {
    //brute force solution
        //tc- O(2N)
        //sc- O(3)
        int[] arr = {1,2,-4,-5};
        int n = arr.length;
////        List<Integer> resultant = new ArrayList<>();
////        List<Integer> positives = new ArrayList<>();
////        List<Integer> negatives = new ArrayList<>();
////        for(int i =0;i<n;i++){
////
////            if(arr[i]>0){
////                positives.add(arr[i]);
////
////            }else{
////              negatives.add(arr[i]);
////            }
////
////        }
////        int positiveIndex =0;
////        int negativeIndex =0;
////        for(int i =0;i<n;i++){
////
////            if(i%2==0){
////                if(positiveIndex<positives.size()) {
////                    resultant.add(positives.get(positiveIndex));
////                    positiveIndex++;
////                }
////            }
////            else{
////                if(negativeIndex<negatives.size()) {
////                    resultant.add(negatives.get(negativeIndex));
////                    negativeIndex++;
////                }
////            }
////
////        }
//
//System.out.println(resultant);

        //optimal
        //tc-on
        //sc-o1
        int[] res = new int[4];
        int posIndex = 0;
        int negIndex=1;

        for(int i=0; i<n;i++){

            if(arr[i]>0){
                res[posIndex]=arr[i];
                posIndex = posIndex +2;
            }
            else{
                res[negIndex] =arr[i];
                negIndex =negIndex+2;
            }

        }

        System.out.println(Arrays.toString(res));

    }



}
