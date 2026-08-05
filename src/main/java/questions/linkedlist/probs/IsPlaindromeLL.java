package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

import java.util.Stack;

public class IsPlaindromeLL {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(1);

        n1.next = n2;
        n2.next = n3;

        System.out.println("is palindrome - " + isPalindromeLL(n1));

    }

    public static boolean isPalindromeLL(Node ll){

        boolean isPalindrome = true;

        Node temp = ll;
        Node prev = null;

        while(temp!=null){
            prev = new Node(temp.data,prev);
            temp = temp.next;
        }
        Node org = ll;
        while (prev!=null && org!=null){

            if(prev.data!= org.data){
                isPalindrome=false;
                break;
            }

            prev = prev.next;
            org = org.next;
        }

    return isPalindrome;

    }

    //tc - O(N)
    //sc - O(N)
    //mine approach
}
