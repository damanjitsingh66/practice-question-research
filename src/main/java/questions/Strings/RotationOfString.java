package questions.Strings;

public class RotationOfString {
    public static void main(String[] args) {
        String s = "rotation";
        String goal = "tionrota";
        System.out.println(isRotatedString(s,goal));
    }
    public static boolean isRotatedString(String s, String goal){

        if(s.length()!=goal.length()){
            return false;
        }
             String res = s+s;
        return res.contains(goal);
    }
}
//tc- O(N)