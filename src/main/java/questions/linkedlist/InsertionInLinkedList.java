package questions.linkedlist;

public class InsertionInLinkedList {

    public static void main(String[] args) {

        Node org = new Node(2);
           org.next = new Node(3);

           Node fin = insertNode(1, org);

           Node temp = fin;
           while(temp!=null){
               System.out.println( "node element is - " + temp.data);
               temp = temp.next;
           }

    }

    public static Node insertNode(int data, Node head){
        Node res = new Node(data, head);
        return res;
    }
}

