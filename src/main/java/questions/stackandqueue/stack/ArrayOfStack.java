package questions.stackandqueue.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfStack {

    public static void main(String[] args) {



        List<String> operations = Arrays.asList("ArrayStack", "push", "push", "peek", "pop", "isEmpty");
        List<List<Integer>> operationValues = Arrays.asList(List.of(), List.of(5), List.of(10), List.of(), List.of(), List.of());

        List<List<Integer>> results = new ArrayList<>();
        int peek = -1;
        int size = operations.size();

        int i = 0;
        int[] arr = null;
        while(i<size){

            switch (operations.get(i)){
                case "ArrayStack":
                  arr = operationValues.get(i).stream().mapToInt(Integer::intValue).toArray();
                  results.add(Arrays.stream(arr).boxed().toList());
                  break;
                case "push":
                    push(arr,peek,operationValues.get(i).get(0));
                    results.add(null);
                    break;


            }



        }



    }

    private static void push(int[] arr, int peek,int element){
    peek++;
    arr[peek]=element;
    }
    private static int pop(int[] arr, int peek){
        int res = arr[peek];
        peek--;
        return res;
    }
    private static Integer peek(int[] arr,int peek){
     return arr[peek];
    }
    private static boolean isEmpty(int[] arr){
    return arr==null || arr.length!=0;
    }

}
