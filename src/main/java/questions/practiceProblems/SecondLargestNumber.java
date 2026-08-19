package questions.practiceProblems;

public class SecondLargestNumber {
    public static void main(String[] args) {

    int[] arr = {10,20,4500,400,2};

     System.out.println(secondLargestNumber(arr));


    }
    public static int secondLargestNumber(int[] arr){

        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){

            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){

                secondLargest = arr[i];

            }

        }

     return secondLargest;

    }
    //tc- O(N)
    //sc- O(1)

}
