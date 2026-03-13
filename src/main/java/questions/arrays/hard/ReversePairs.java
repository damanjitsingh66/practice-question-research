package questions.arrays.hard;

public class ReversePairs {

    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1,3,2,3,1};
        int count=0;
        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length;j++){

                if(arr[i] > 2*arr[j]){
                    count++;
                }

            }

        }
       System.out.println(count);
    }

}
