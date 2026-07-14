package questions.linkedlist.onedimensional;

public class DeletionInLinkedList {

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

        Node tempv = delete(l);
        while(tempv!=null){
            System.out.println( "after node element is - " + tempv.data);
            tempv = tempv.next;
        }
    }

    public static Node delete(Node ll){

        if(ll == null || ll.next == null){
            return null;
        }

        Node curr = ll;
        while(curr.next.next!=null){
            curr = curr.next;
        }
        curr.next = null;

        return ll;
    }



}




