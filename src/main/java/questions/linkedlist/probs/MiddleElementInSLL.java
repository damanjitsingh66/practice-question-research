package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

public class MiddleElementInSLL {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        Node sLL = convertArrayToDLL(arr);
        Node temp = sLL;
        int count = 0;
        while(temp!=null){
            System.out.println("ele - " + temp.data);
            temp = temp.next;
            count ++;
        }
        System.out.println(count);

        Node hare = sLL;
        Node tortoise = sLL;
        while(hare!=null && hare.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;

        }
        System.out.println("mid is -" + tortoise.data);
    }
    public static Node convertArrayToDLL(int[] arr){
        int first = arr[0];
        Node res = new Node(first);
        Node temp = res;
        for(int i=1; i< arr.length;i++){
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
      return res;
    }
}
//optimal solution with tc - O(N/2) overall
// sc - O(1)