package questions.linkedlist.twodimensional;

public class TraverseInTwoDimensional {

    public static void main(String[] args) {

        int first = 1;
        Node ddl = new Node(first);




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
