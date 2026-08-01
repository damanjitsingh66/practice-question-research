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
        Stack<Integer> rev = new Stack<>();
        while(temp!=null){

            rev.push(temp.data);

            temp = temp.next;

        }
        Node org = ll;

        while(org!=null){

            if(org.data!=rev.peek()){
                isPalindrome=false;
            }
            rev.pop();
            org = org.next;

        }

    return isPalindrome;

    }

    //tc - O(N)
    //sc - O(N)
}
