package questions.stackandqueue.stack;

import weka.core.expressionlanguage.common.Primitives;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        //infix to postfix
        String s = " + a b ";
        String sf = s.replaceAll(" ", "");
        Stack<String> stack = new Stack<>();
        for (int i = sf.length() - 1; i >= 0; i--) {
            char c = sf.charAt(i);
            String cs = String.valueOf(c);
            if (Character.isLetterOrDigit(c)) {
                stack.push(cs);
            } else if (isOperator(c)) {
                String first = stack.pop();
                String second = stack.pop();

                String combined = "( " + first + " " + c + " " + second + " )";
                stack.push(combined);
            }
        }
        System.out.println(stack);
    }

    public static boolean isOperator(char c){
        boolean isOperator = false;
        if(c=='^'||c=='*'||c=='/'||c=='+'||c=='-'){
            isOperator = true;
        }
        return isOperator;
    }
}
