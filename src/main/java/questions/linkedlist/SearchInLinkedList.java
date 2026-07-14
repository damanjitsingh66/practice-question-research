package questions.linkedlist;

public class SearchInLinkedList
{
    public static void main(String[] args) {
        int serach = 0;
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

        System.out.println(" element found  - " + searchInLinkedList(l,serach));
    }
    public static boolean searchInLinkedList(Node ll, int target){

        boolean result = false;
        Node curr = ll;
        while(curr!=null){
            if (curr.data == target) {
                result = true;
                break;
            }
            curr = curr.next;

        }
        return result;
    }
}
