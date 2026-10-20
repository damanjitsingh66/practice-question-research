package questions.arrays;

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {
      int secondLargest = Integer.MIN_VALUE;
      int largestElement = Integer.MIN_VALUE;

      for (int i=0;i<arr.length;i++){

          if(arr[i]>largestElement){
              secondLargest = largestElement;
              largestElement = arr[i];
          }
          else if(arr[i]>secondLargest && arr[i]!=largestElement){
              secondLargest = arr[i];
          }
      }
         return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 20, 15};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
