package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

import java.util.HashSet;
import java.util.Set;

public class FirstElementInCircle {

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

        Set<Node> visited = new HashSet<>();
        Node head = null;
        while(temp!=null){

            if(visited.contains(temp)){
                 head = temp;
                 break;
            }
           visited.add(temp);
            temp = temp.next;
        }

      System.out.println("first circular node is - " + head.data!=null?head.data:null);
    }

    //tc- O(N)
    //sc - O(N)
}
