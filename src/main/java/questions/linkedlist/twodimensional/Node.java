package questions.linkedlist.twodimensional;

public class Node {

    Node prev;
    int data;
    Node next;


    Node(int data1){
        prev = null;
        data = data1;
        next = null;
    }

    Node(int data1, Node prev1, Node next1){
        prev = prev1;
        data = data1;
        next = next1;
    }

}
