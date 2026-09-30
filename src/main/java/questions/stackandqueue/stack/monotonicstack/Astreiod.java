package questions.stackandqueue.stack.monotonicstack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Astreiod {

    public static void main(String[] args) {
        int[] asteroids = {1, 2, 3, -4};
        Stack<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<asteroids.length;i++){

            if(asteroids[i]>0) {
              stack.push(asteroids[i]);
            }else {
                boolean zeroed = false;
                while(!stack.isEmpty() && stack.peek()+asteroids[i]<=0) {
                    if(stack.peek()+asteroids[i]==0){
                        stack.pop();
                        zeroed = true;
                        break;
                    }
                   stack.pop();
                }
                if(!zeroed && stack.isEmpty()) {
                    res.add(asteroids[i]);
                }
            }

        }
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
res.forEach(System.out::println);

    }

}
