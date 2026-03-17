package questions.binarysearch;

public class LowerBound {

    public static void main(String[] args) {

        int[] arr ={1,3,4,6,6,7,8};

        int k = 0;

        System.out.println(element(arr,k));

    }

    public static int element(int[] arr, int k){

        for(int i =0; i<arr.length;i++){

            if(arr[i]>=k){
              return i;
            }
        }
        return arr.length-1;
    }

    //tc- O(N), sc - O(1)
}
