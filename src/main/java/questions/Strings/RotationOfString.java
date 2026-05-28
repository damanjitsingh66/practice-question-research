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
        String res = s;
        for(int i=0;i<s.length();i++){
             res = res.substring(1);
             res = res + s.charAt(i);
             if(res.equals(goal)){
                 return true;
             }
        }
        return false;
    }
}
//my solution