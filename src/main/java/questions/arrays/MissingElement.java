package questions.arrays;

public class MissingElement {

    public static void main(String[] args) {

        int[] nums = {1,2,4,5};
        int n= 5;
        int sum = (n *(n+1))/2;
        int summition = 0;
        for(int i=0; i<nums.length;i++){

            summition += nums[i];

        }

        System.out.println(sum - summition);

    }
}
