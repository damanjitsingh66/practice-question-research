package questions.linkedlist.probs;

import questions.linkedlist.onedimensional.Node;

public class MiddleElementInSLL {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        Node sLL = convertArrayToDLL(arr);
        Node temp = sLL;
        int count = 0;
        while(temp!=null){
            System.out.println("ele - " + temp.data);
            temp = temp.next;
            count ++;
        }
        System.out.println(count);
        int index = 0;
        if(count%2==0){
            index = count/2 + 1;
        }else{
            index = count/2;
        }
        int res_count = 0;
        Node temp2 = sLL;
        while(sLL!=null){
            res_count++;
            if(res_count==index) {
                System.out.println("middle ele - " + temp2.data);
                temp2 = temp2.next;
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
