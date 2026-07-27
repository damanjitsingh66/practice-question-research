package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCircleinLL {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;


       Node temp = n1;
       Node slow = temp;
       Node fast = temp;
        boolean inCircle = false;

        while(fast!=null && fast.next!=null){

           slow  = slow.next;
           fast = fast.next.next;

           if(slow == fast){
               inCircle= true;
               break;
           }
        }

        System.out.println("in circle - " + inCircle);

    }
    //tc = O(n)
    //sc = O(1)

}
