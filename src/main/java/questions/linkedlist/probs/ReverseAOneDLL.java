package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

public class ReverseAOneDLL {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        Node sLL = convertArrToSLL(arr);

        Node temp = sLL;
        while(temp!=null){
            System.out.println("ele is - " + temp.data);
            temp = temp.next;
        }
        Node rev = reversesLL(sLL);
        while(rev!=null){
            System.out.println("after rev data is - " + rev.data);
            rev = rev.next;
        }

    }
    public static Node convertArrToSLL(int[] arr){
        int first_ele = arr[0];
        Node res = new Node(first_ele);
        Node temp = res;
        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

      return res;
    }

    public static Node reversesLL(Node sLL) {

        Node prev = null;
        Node temp = sLL;
        while (temp != null) {
            Node front = temp.next;

            temp.next = prev;

            prev = temp;

            temp = front;
        }

        return prev;
    }



}
