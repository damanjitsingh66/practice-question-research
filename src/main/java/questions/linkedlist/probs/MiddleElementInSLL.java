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
        int index = count/2;

        int res_count = 0;
        Node temp2 = sLL;
        while(temp2!=null){
            res_count++;
            temp2 = temp2.next;
            if(res_count==index) {
                System.out.println("middle ele - " + temp2.data);
                break;
            }
        }
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
//brute force solution with tc - O(N) overall and org - O(N+N/2)
// sc - O(1)