package questions.linkedlist.twodimensional;

public class TraverseInTwoDimensional {

    public static void main(String[] args) {

        int first = 1;
        Node ddl = new Node(first);

        int[] arr = {1,2,3,4,5};

        Node res_arr = convertArrToDLL(arr);
        while(res_arr!=null){
            System.out.println("element is : - " + res_arr.data);
            res_arr = res_arr.next;
        }

    }

    public static Node insertElementAtTail(int data, Node prev, Node next){


    return null;
    }

    public static Node convertArrToDLL(int[] arr){
        int first = arr[0];

        Node res = new Node(first);
        Node prev = res;
        for(int i = 1; i<arr.length; i++){

              Node temp = new Node(arr[i],res,null);
              prev.next = temp;
              prev= temp;

        }
     return res;

    }

}
