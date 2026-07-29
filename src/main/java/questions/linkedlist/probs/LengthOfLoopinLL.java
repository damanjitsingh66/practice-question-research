package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLoopinLL {


    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        Node temp = n1;
        int timer = 1;
        int result = 0;
        Map<Integer,Integer> resMap = new HashMap<>();
        while (temp != null) {

           if(resMap.containsKey(temp.data)){
               result = timer - resMap.get(temp.data);
               break;
           }
           resMap.put(temp.data,timer);
            temp = temp.next;
           timer++;
        }

        System.out.println("total nodes are - " + result);
    }
    }
//tc - O(N)
//sc- ON)