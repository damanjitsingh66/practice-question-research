package questions.stackandqueue.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {

        List<String> operations = Arrays.asList("StackQueue", "push", "push", "pop", "peek", "isEmpty");
        List<List<Integer>> values = List.of(List.of(), List.of(4), List.of(8), List.of(), List.of(), List.of());
        List<String> results = new ArrayList<>();
        StackQueue stackQueue = null;
        for(int i=0;i<operations.size();i++){

            switch (operations.get(i)) {
                case "StackQueue":
                    stackQueue = new StackQueue();
                    results.add("null");
                   break;
                case "push":
                    if(stackQueue==null){
                        throw new RuntimeException("stack queue is empty");
                    }
                     stackQueue.push(values.get(i).get(0));
                     results.add("null");
                    break;
                case "pop":
                    if(stackQueue==null){
                        throw new RuntimeException("stack queue is empty");
                    }
                     results.add(Integer.toString(stackQueue.pop()));
                    break;
                case "peek":
                    if(stackQueue==null){
                        throw new RuntimeException("stack queue is empty");
                    }
                    results.add(Integer.toString(stackQueue.peek()));
                    break;
                case "isEmpty":
                    if(stackQueue==null){
                        throw new RuntimeException("stack queue is empty");
                    }
                    results.add(stackQueue.isEmpty()?"true":"false");
                    break;

            }
        }
        results.forEach(System.out::println);

    }

    public static class StackQueue{

        private Stack<Integer> stack1, stack2;

       public StackQueue(){
            stack1 = new Stack<>();
            stack2 = new Stack<>();
       }

       public void push(int i){
           stack1.add(i);
       }
        public int pop(){

         if(stack2.isEmpty() && !stack1.isEmpty()){
             while(!stack1.isEmpty()) {
                 stack2.add(stack1.pop());
             }
         }
         if(stack1.isEmpty() && stack2.isEmpty()){
             throw new RuntimeException("stack is empty");
         }
           return stack2.pop();
        }
        public int peek(){
            if(stack2.isEmpty() && !stack1.isEmpty()){
                while(!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
            }
            if(stack1.isEmpty() && stack2.isEmpty()){
                throw new RuntimeException("stack is empty");
            }
            return stack2.peek();
        }
        public boolean isEmpty(){
         return stack1.isEmpty() && stack2.isEmpty();
        }

    }

}
//tc - O(1)

//approach take two stacks
 // in push just add the elements in stack1
//in pop just pop the elements form stack1 and push to stack2 then pop element from stack2
//in pee