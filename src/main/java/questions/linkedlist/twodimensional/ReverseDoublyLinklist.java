package questions.linkedlist.twodimensional;

public class ReverseDoublyLinklist {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        Node convertedLL = convertArrToDLL(arr);

        while(convertedLL!=null){
            System.out.println("element - "+convertedLL.data);
            convertedLL = convertedLL.next;
        }
    }

    public static Node convertArrToDLL(int[] arr){
        Node res = new Node(arr[0]);
        Node prev = res;
       for(int i=1; i<arr.length;i++){
       Node temp = new Node(arr[i], prev, null);
       prev.next = temp;
       prev= temp;
     }
        return res;
    }
}
