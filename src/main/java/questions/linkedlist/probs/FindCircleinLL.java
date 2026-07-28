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

        Node res = null;
        Node slow = n1;
        Node fast = n1;

        // Traverse while fast and fast.next are not null
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;

            // Move fast two steps
            fast = fast.next.next;

            // If they meet, cycle is present
            if (slow == fast) {
                // Reset slow to head
                slow = n1;

                // Move both one step to find start of loop
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }

                // Return the starting node of loop
                res = slow;
                break;
            }
        }


        System.out.println("in circle first is - " + (res!=null?res.data:null));

    }
    //tc = O(n)
    //sc = O(1)

}
