package questions.stackandqueue.stack;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {


        String s = "{}[{}}()]";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(s.charAt(i));
            }else{
                char top = stack.peek();
                if(!stack.isEmpty() && (
                        (top=='(' && c==')')
                        ||  (top=='{' && c=='}')
                        ||  (top=='[' && c==']')
                )){
                    stack.pop();
                }
                else{
                    break;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("this is valid");
        }else{
            System.out.println("this is not valid");
        }

        //tc - O(n)
        //SC - 0(N)
    }
}
