package questions.Strings;

public class MaximumNestedDepthOfParanthesis {

    public static void main(String[] args) {
        String  s = "(1)+((2))+((3))";
        //output - 3
//        String s = "((()))";

System.out.println(maximumNestedDepth(s));
    }

    public static int maximumNestedDepth(String s){

        int level = 0;
        int count = 1;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<s.length();i++){

            if(s.charAt(i)=='(') {
                if(level>0) {
                    count++;
                }
                level++;
            }
            else if(s.charAt(i)==')'){
                 if(level ==0){
                     count = 1;
                 }
                level--;
                if(level>0) {
                    count--;
                }

            }
            max = Math.max(count,max);
        }


        return max;
    }

}
