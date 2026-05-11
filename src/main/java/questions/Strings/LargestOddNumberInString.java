package questions.Strings;

public class LargestOddNumberInString {

    public static void main(String[] args) {

        String num = "5347";
        int n = num.length();
        for(int i=0; i<n; i++){
            if(i==0){
                num = num.substring(i);
          }else{
                num = num.substring(1);
            }
            System.out.println(num);
        }


        int numo = Integer.parseInt(num);






    }

    public static void generatePairs(int numo){
        while(numo > 0){
            System.out.println(numo);
            numo=numo /10;
        }
    }
}
