package questions.linkedlist;

public class InsertionInLinkedList {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Creating a sample linked list: 2 -> 3
        Node1 head = new Node1(2);
        head.next = new Node1(3);

        System.out.print("Original List: ");
        sol.printList(head);

        // Inserting new node at head
        head = sol.insertAtHead(head, 1);

        System.out.print("After Insertion at Head: ");
        sol.printList(head);
    }

}
// Node class to represent each node in the linked list
class Node1 {
    int data;
    Node1 next;

    // Constructor with data and next pointer
    Node1(int data1, Node1 next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data
    Node1(int data1) {
        data = data1;
        next = null;
    }
}

// Solution class to handle linked list operations
class Solution {
    // Function to insert a new node at the head
    public Node1 insertAtHead(Node1 head, int newData) {
        // Create a new node whose next points to current head
        Node1 newNode = new Node1(newData, head);
        // Return the new node as the head
        return newNode;
    }

    // Function to print the linked list
    public void printList(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

