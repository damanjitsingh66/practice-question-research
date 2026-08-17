package questions.stackandqueue.stack;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class StackUsingQueue {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30
        System.out.println("Pop: " + stack.pop());   // 20
        System.out.println("Is Empty? " + stack.isEmpty()); // false
    }

    static class ArrayStack {

        private Queue<Integer> queue;

        public ArrayStack(int capacity) {
            queue = new ArrayBlockingQueue<>(capacity);
        }

        public void push(int element) {
            int size = queue.size();
            queue.add(element);

            // Rotate the queue to bring the newly added element to the front
            for (int i = 0; i < size; i++) {
                queue.add(queue.remove());
            }
        }

        // Pop operation: O(1) time complexity
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is underflow / empty");
            }
            return queue.remove();
        }

        // Peek operation: O(1) time complexity
        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return queue.peek();
        }

        // IsEmpty operation: O(1) time complexity
        public boolean isEmpty() {
            return queue.isEmpty();
        }
    }
}