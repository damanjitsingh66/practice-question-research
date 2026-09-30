package questions.stackandqueue.stack;

import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
        String s = "a + b * (c^d - e) ^ (f + g * h) - i";
        String s4 = s.replaceAll(" ", "");
        System.out.println("Cleaned Expression: " + s4);

        Stack<Character> stack = new Stack<>();
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s4.length(); i++) {
            char c = s4.charAt(i);

            // 1. If the character is an operand (letter or digit), add it to output
            if (Character.isLetterOrDigit(c)) {
                st.append(c);
            }
            // 2. If the character is '(', push it to the stack
            else if (c == '(') {
                stack.push(c);
            }
            // 3. If the character is ')', pop until '(' is encountered
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    st.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // Remove '('
                }
            }
            // 4. If it's an operator
            else if (isOperator(c)) {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.peek();
                    // Handle associativity: strictly less for '^', less-than-or-equal for others
                    if (precedence(top) > precedence(c) ||
                            (precedence(top) == precedence(c) && c != '^')) {
                        st.append(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(c);
            }
        }

        // Pop all remaining operators from the stack
        while (!stack.isEmpty()) {
            st.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + st.toString());
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
