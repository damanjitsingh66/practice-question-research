package questions.Strings;

public class RecursiveImplementationOfATOI {

    public static void main(String[] args) {

        String a = "  -123";

        System.out.println(atoi(a)); // 123
    }

    public static int atoi(String str) {
     long result = 0;
     int i = 0;
     int sign  = 1;

      if(str==null || str.isEmpty()){

          return 0;
      }
//rule 1
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
      //rule 2
      if(i<str.length() && str.contains("-")){
          sign=-1;
          i++;
        }
        if(i<str.length() && str.contains("+")){
            i++;
        }
        //rule 3
        while(i<str.length() && Character.isDigit(str.charAt(i))){
            int digit = str.charAt(i) - '0';
            result = result * 10 + digit;

            if(sign * result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign * result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }

     return (int) result * sign;
    }
//tc - O(N)
}
