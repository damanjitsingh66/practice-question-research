package questions.stackandqueue.stack.monotonicstack;

import java.util.ArrayDeque;
import java.util.Deque;

public class MonotonicStackIncreasingDecreasingOrder {

   private static Deque<Integer> stack = new ArrayDeque<>();

   private void push(int element){

       while(!stack.isEmpty() && stack.peek()>element){     //for increasing we check with peek > greater element in the stack and for decreasing we check with coming element being greater
           stack.pop();
       }
       stack.push(element);
   }
    private int peek(){
      if(stack.isEmpty()){
          throw new RuntimeException("stack is empty");
      }
       return stack.peek();
    }
    private int pop(){
        return stack.pop();
    }
    private boolean isEmpty(int element){

      return stack.isEmpty();
    }


    public static void main(String[] args) {

       MonotonicStackIncreasingDecreasingOrder s = new MonotonicStackIncreasingDecreasingOrder();

       int[] arr = {11,12,13};

       for(int val:arr){
           s.push(val);
       }

       while(!stack.isEmpty()){
           System.out.println(s.pop());
       }
    }






}
