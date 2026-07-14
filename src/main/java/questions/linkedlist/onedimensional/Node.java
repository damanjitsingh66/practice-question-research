package questions.linkedlist.onedimensional;

public class Node {

    int data;
    Node next;

    Node(int data1){
        data = data1;
        next = null;
    }

    Node(int data1, Node head){
        data = data1;
        next = head;
    }

}
