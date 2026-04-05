package questions.binarysearch;

public class SearchElementInRotatedSortedArrayII {

    public static void main(String[] args) {

        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int n = arr.length;
        int k = 12;
        System.out.println("output : - " + searchElementInRotatedSortedArrayII(arr,k));

    }

    public static boolean searchElementInRotatedSortedArrayII(int[] arr, int k){
      int low = 0;
      int high = arr.length - 1;

      while(low<high){

          int mid = (low + high) / 2;

          if(arr[mid] == k){
              return true;
          }

          if(arr[low]==arr[mid] || arr[mid]==arr[high]){
              low = low + 1;
              high = high - 1;
              continue;
          }

          if(arr[low]<arr[mid]){
              //check if the left side is sorted
              if(arr[low]<= k && k<arr[mid]){
                  high  =  mid - 1;
              }
              else{
                  low  = mid + 1;
              }
          }
          else{
              if(arr[mid]<k && k<arr[high]){
                  low  = mid + 1;
              }
              else{
                  high = mid - 1;
              }
          }

      }


      return false;
    }


 //tc - O (log n)
    //sc - O(1)
}
