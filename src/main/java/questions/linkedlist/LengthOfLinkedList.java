package questions.linkedlist;

public class LengthOfLinkedList {

    public static void main(String[] args) {
        int i = 2;
        int n = 7;

        Node l = new Node(1);
        Node temp = l;
        while(i<=n)
        {
            temp.next = new Node(i);
            temp = temp.next;
            i++;
        }

        Node tempc = l;
        while(tempc!=null){
            System.out.println( "prev node element is - " + tempc.data);
            tempc = tempc.next;
        }

       System.out.println("count is - " + lengthOfLL(l));
    }
    public static int lengthOfLL(Node ll){

        if(ll.next == null){
            return 1;
        }
        int count = 2;
        Node curr = ll;
        while(curr.next.next!=null){
            curr = curr.next;
            count++;
        }

        return count;
    }

}
