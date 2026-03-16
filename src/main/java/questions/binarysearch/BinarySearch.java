package questions.binarysearch;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1,2,3,44,55,77,78};
        int target = 1;
        System.out.println(search(arr,target));
    }

    public static int search(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        while (low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]== target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                low = mid+ 1;
            }
            else{
                high = mid - 1;
            }

        }

        return -1;
    }

    //tc=O(N)
    //sc=O(1)
}
