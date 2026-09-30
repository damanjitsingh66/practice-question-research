package questions.random;

public class FindSmallIestInRoatatedArray
{

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int left = 0;
        int right = arr.length-1;

        while (left<right){

            int mid = (left + right)/2;


            if(arr[mid]>arr[right]){
                left = mid + 1;
            }
            else{
               right = mid;
            }
        }
System.out.println(arr[left]);
    }
}
//this is o(n)