package questions.binarysearch.answer;

import java.util.Arrays;

public class KokoEatingBananas {

    public static void main(String[] args) {

        int[] arr = {3,6,7,11};
        int n  = arr.length;
        int hours = 9;



        int max =  Arrays.stream(arr).max().getAsInt();;
        for(int i=1; i<=max; i++){

            int count = 0;

            for(int j=0; j<n;j++){

                int div = arr[j]/i;
                int rem = arr[j]%i;
                if(div==0 && rem==0){
                    div =1;
                }
                if(rem>0){
                    div = div + 1;
                }
                count = count + div;
            }

            if(count <= hours){
                System.out.println(i);
                break;
            }
        }
      //tc = O(mxn)
        //sc = O(1)


    }
}
