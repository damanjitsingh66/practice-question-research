package questions.binarysearch;

public class UpperBound {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5,6,8};
        int k = 5;
     System.out.println(element(arr,k));

    }

    public static int element(int[] arr, int k){

        for(int i=0; i< arr.length; i++){
            if(arr[i]>k){
                return i;
            }
        }
       return arr.length;
           }

           //tc - O(N) and //sc - O(1)
}
