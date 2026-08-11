package questions.stackandqueue.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfStack {

    public static void main(String[] args) {

        List<String> operations = Arrays.asList(
                "ArrayStack",
                "push",
                "push",
                "peek",
                "pop",
                "isEmpty"
        );

        List<List<Integer>> operationValues = Arrays.asList(
                List.of(),
                List.of(5),
                List.of(10),
                List.of(),
                List.of(),
                List.of()
        );

        List<Object> results = new ArrayList<>();

        ArrayStack stack = null;

        for (int i = 0; i < operations.size(); i++) {

            switch (operations.get(i)) {

                case "ArrayStack":
                    stack = new ArrayStack(10);
                    results.add(null);
                    break;

                case "push":
                    stack.push(operationValues.get(i).get(0));
                    results.add(null);
                    break;

                case "pop":
                    results.add(stack.pop());
                    break;

                case "peek":
                    results.add(stack.peek());
                    break;

                case "isEmpty":
                    results.add(stack.isEmpty());
                    break;

                default:
                    throw new IllegalArgumentException(
                            "Unknown operation: " + operations.get(i)
                    );
            }
        }

        for (Object result : results) {
            System.out.println(result);
        }
    }

    static class ArrayStack {

        private final int[] arr;
        private int top = -1;

        public ArrayStack(int capacity) {
            arr = new int[capacity];
        }

        public void push(int element) {
            if (top == arr.length - 1) {
                throw new RuntimeException("Stack is full");
            }

            arr[++top] = element;
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            return arr[top--];
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }

            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
}