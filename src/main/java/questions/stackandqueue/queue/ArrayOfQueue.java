package questions.stackandqueue.queue;

import questions.stackandqueue.stack.ArrayOfStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfQueue {
    public static void main(String[] args) {


        List<String> operations = Arrays.asList(
                "ArrayQueue",
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

        ArrayOfQueue.ArrayQueue queue = null;

        for (int i = 0; i < operations.size(); i++) {

            switch (operations.get(i)) {

                case "ArrayQueue":
                    queue = new ArrayOfQueue.ArrayQueue(10);
                    results.add(null);
                    break;

                case "push":
                    queue.push(10,operationValues.get(i).get(0));
                    results.add(null);
                    break;

                case "pop":
                    results.add(queue.pop(10));
                    break;

                case "peek":
                    results.add(queue.peek());
                    break;

                case "isEmpty":
                    results.add(queue.isEmpty());
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

    static class ArrayQueue{

        private final int[] arr ;

      public ArrayQueue(int capacity){
          arr = new int[capacity];
      }
      int start = 0;
      int end =-1;
      int size = 0;

      public Object push(int capacity, int ele){
          if(size>arr.length-1){
              throw new RuntimeException("queue limit exceeded");
          }
          end = (end + 1)  % capacity;
          arr[end] = ele;
          size = size + 1;
          return ele;
      }
      public Object pop(int capacity){
          if(size==0){
              return new ArrayList<>();
          }
          int intial = start;
          start = (start + 1) % capacity;
          size = size - 1;
          return arr[intial];
      }
      public Object peek(){
          return arr[start];
      }
      public Object isEmpty(){
          return size==0;
      }

    }
    }

