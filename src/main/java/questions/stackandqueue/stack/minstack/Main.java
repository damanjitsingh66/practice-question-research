package questions.stackandqueue.stack.minstack;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> inputs = Arrays.asList("minStack","push","push","push","pop","push","min");
        List<List<Integer>> iValues= new ArrayList<>();
        iValues.add(List.of());
        iValues.add(List.of(1));
        iValues.add(List.of(3));
        iValues.add(List.of(6));
        iValues.add(List.of());
        iValues.add(List.of(5));
        iValues.add(List.of());
        MinStack tack = null;
        int count = 0;
        for(String in:inputs){
            List<Integer> listElement = iValues.get(count);
          switch (in){
              case "minStack":
                  tack = new MinStack(10);
                  System.out.println("null");
                  break;
              case "push":
                  assert tack != null;
                  tack.push(listElement.get(0));
                  System.out.println("null");
                  break;
              case "pop":
                  assert tack != null;
                  System.out.println(tack.pop());
                  break;
              case "top":
                  assert tack != null;
                  System.out.println(tack.peek());
                  break;
              case "min":
                  assert tack != null;
                  System.out.println(tack.min());
                  break;
              default:{
                  System.out.println("not reachable");
              }
          }
          count++;
        }
    }

    public static class MinStack{

        int[] arr ;
        Queue<Integer> q;
        int index = -1;

        MinStack(int capacity){
            arr = new int[capacity];
            q = new LinkedList<>();
            }


        //push
        public void push(int x) {
            // Get size
            int s = q.size();
            // Add element
            q.add(x);

            // Move elements before new element to back
            for (int i = 0; i < s; i++) {
                q.add(q.poll());
            }
        }
        //
        public int pop(){

            int n = q.peek();
            // Remove front element
            q.poll();
            // Return removed element
            return n;
        }
        //peek
        public int peek(){
           if(q.isEmpty()){
              throw new RuntimeException("stack is empty");
           }
            return q.peek();
        }
        public int min(){
//            if(index==-1){
//                throw new RuntimeException("stack is empty");
//            }
//            int min = Integer.MAX_VALUE;
//                   for(int i=0;i<=index;i++){
//                       if(arr[i]<min){
//                           min = arr[i];
//                       }
//                   }
//            return min;
            return 0;
        }
    }

}



//// Example 1:
//Input:
// ["MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"]
//[ [], [-2], [0], [-3], [ ], [ ], [ ], [ ] ]
//Output:
// [null, null, null, null, -3, null, 0, -2]
//Explanation:
//
//MinStack minStack = new MinStack();
//- minStack.push(-2);
//- minStack.push(0);
//- minStack.push(-3);
//- minStack.getMin(); // returns -3
//- minStack.pop();
//- minStack.top(); // returns 0
//- minStack.getMin(); // returns -2
//
//Example 2:
//Input:
// ["MinStack", "push", "push", "getMin", "push", "pop", "getMin", "top"]
//[ [ ], [5], [1], [ ], [3], [ ], [ ], [ ] ]
//Output:
// [null, null, null, 1, null, null, 1, 1]
//Explanation:
//
//MinStack minStack = new MinStack();
//- minStack.push(5);
//- minStack.push(1);
//- minStack.getMin(); // returns 1
//- minStack.push(3);
//- minStack.pop();
//- minStack.getMin(); // returns 1
//- minStack.top(); // returns 1
//class Main {
//    public static void main(String[] args) {
//        System.out.println("Start small. Ship something.");
//    }
//}