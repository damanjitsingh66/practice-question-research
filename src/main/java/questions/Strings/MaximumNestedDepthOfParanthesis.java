package questions.Strings;

public class MaximumNestedDepthOfParanthesis {

    public static void main(String[] args) {
        String  s = "(1)+((2))+(((3)))";

System.out.println(maximumNestedDepth(s));
    }
//correct one
    public static int maximumNestedDepth(String s){

        int level = 0;
        int max = 0;

        for(int i=0; i<s.length();i++){

            if(s.charAt(i)=='(') {
                level++;
            }
            else if(s.charAt(i)==')'){
                level--;
            }
            max = Math.max(level,max);
        }
        return max;
    }
//tc- O(N)
    //sc-O(1)
}
