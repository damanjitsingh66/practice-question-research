package questions.linkedlist.onedimensional;

public class Node {

   public int data;
    public Node next;

    public Node(int data1){
        data = data1;
        next = null;
    }

    public Node(int data1, Node head){
        data = data1;
        next = head;
    }

}
