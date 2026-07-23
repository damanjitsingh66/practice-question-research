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
        n4.next = n1;

        List<Integer> elements = new ArrayList<>();
        Map<Integer,Integer> data = new HashMap<>();
        Node temp = n1;
        data.put(n1.data,1);
        data.put(n2.data,1);
        while(temp.next.data!=2){

            Node next = temp.next;

            data.put(next.data,data.getOrDefault(next.data, 0) + 1);
            temp = next;
        }

        boolean inCircle = false;
        for(Map.Entry<Integer,Integer> e: data.entrySet()){
            if(e.getValue()>1){
                inCircle = true;
            }
        }

        System.out.println("in circle - " + inCircle);




    }

}
