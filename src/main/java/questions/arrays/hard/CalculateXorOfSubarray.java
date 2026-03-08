package questions.arrays.hard;

public class CalculateXorOfSubarray {

    public static void main(String[] args) {

    int[] arr = {4,2,2,6,4};
    int count = 0;
    int k=6;

    for(int i=0;i<arr.length;i++){

        int sum = 0;

        for(int j=i; j<arr.length;j++){

            sum  = sum ^ arr[j];

            if(sum == k){
                count++;
            }
        }
    }
    System.out.println(count);
//tc-on^2 sc - o1
    }


}
