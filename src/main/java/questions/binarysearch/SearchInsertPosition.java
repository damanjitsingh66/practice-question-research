package questions.binarysearch;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7};
        int target = 3;
        System.out.println("insert index element - "+ insertIndex(arr,target));
    }
    public static int insertIndex(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return arr.length;
    }
    //tc-O(N)
    //sc-O(1)
}
