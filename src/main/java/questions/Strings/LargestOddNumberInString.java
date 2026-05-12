package questions.Strings;

public class LargestOddNumberInString {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        String num = "5424";
        int n = num.length();
        for(int i=0; i<n; i++){
            if(i==0){
                num = num.substring(i);
          }else{
                num = num.substring(1);
            }
            int numo = Integer.parseInt(num);
           int largestNumber =  maxOddNumber(numo);
           if(largestNumber>max){
               max = largestNumber;
           }
        }
        System.out.println(max);

    }

    public static int maxOddNumber(int numo){
        int max = Integer.MIN_VALUE;
        while(numo > 0){
            if(numo>max){
                if(numo%2!=0) {
                    max = numo;
                }
            }
                numo = numo / 10;

        }
        return max;
    }
}
//mine wrong approach