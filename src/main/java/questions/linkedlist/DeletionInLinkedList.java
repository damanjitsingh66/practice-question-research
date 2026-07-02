package questions.linkedlist;

public class DeletionInLinkedList {
    public static void main(String[] args) {
        Node2 head = new Node2(1);
        head.next = new Node2(2);
        head.next.next = new Node2(3);

        Solution3 obj = new Solution3();
        head = obj.deleteTail(head);

        // Print list after deletion
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
// Definition for singly linked list
class Node2 {
    int data;
    Node2 next;
    Node2(int val) {
        data = val;
        next = null;
    }
}

class Solution3 {
    // Function to delete tail node of linked list
    public Node2 deleteTail(Node2 head) {
        // If list is empty or has one node
        if (head == null || head.next == null) {
            return null;
        }

        // Traverse to the second last node
        Node2 curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }

        // Delete tail node
        curr.next = null;

        // Return updated head
        return head;
    }
}


