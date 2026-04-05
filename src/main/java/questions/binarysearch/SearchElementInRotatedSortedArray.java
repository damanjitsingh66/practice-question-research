package questions.binarysearch;

public class SearchElementInRotatedSortedArray {

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        //output - 4
        int k = 0;

        System.out.println("output:- " + searchElementInRotatedSortedArray(arr, k));


    }
//tc = 0 log n
    //sc = 0(1)

    public static int searchElementInRotatedSortedArray(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                return mid;
            }
            //below logic is used to check is our left portion of array is sorted or not
            if (arr[low] <= arr[mid]) {
                //in the sorted left portion of rotated array

                if (arr[low] <= k && k < arr[mid]) {
                    //this will check the element is between the range
                    high = mid - 1;
                } else {
                    //if element is not in the range then our low changes
                    low = mid + 1;
                }
            } else {
                //in the sorted right portion of rotated array
                if (arr[high] >= k && k > arr[mid]) {
                    //this will check the element is between the range
                    low = mid + 1;
                } else {
                    //if element is not in the range then our high changes
                    high = mid - 1;
                }
            }

        }
        return -1;

    }
}
