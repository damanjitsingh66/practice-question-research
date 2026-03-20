package questions.binarysearch;

public class OccurenceInArray {
    public static void main(String[] args) {

        int[] arr = {3,2,3,3,3,3,4};
        int x= 3;
        //output will be 4
        int count  =0 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== x){
                count++;
            }
        }
        System.out.println(count);
    }
}

//tc - O(N)
//sc -O(1)