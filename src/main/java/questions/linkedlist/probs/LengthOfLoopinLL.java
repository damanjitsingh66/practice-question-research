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
        n4.next = n2;

        Node slow = n1;
        Node fast = n1;
        int length = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

                 if(slow == fast){

                     length = lengthOfLoop(slow);
                     break;
                 }

        }
        System.out.println("length of the loop is : - "+length);
    }

    public static int lengthOfLoop(Node slow){

        int length = 1;
        Node pointOfMeet = slow;

        while(pointOfMeet.next != slow){
            pointOfMeet = pointOfMeet.next;
            length++;
        }

        return length;
    }
    }
//tc - O(N)
//sc- O(1)