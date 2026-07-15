package questions.linkedlist.twodimensional;

public class DeleteLastElementOfDLL {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        Node res_arr = convertArrToDLL(arr);
        int data = 6;
        Node final_res = deleteElementATTail(data,res_arr);
        while(final_res!=null){
            System.out.println("after insertion element is : - " + final_res.data);
            final_res = final_res.next;
        }
    }

    public static Node deleteElementATTail(int data, Node head){

        if(head == null){
            return null;
        }

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp.prev.next = null;

        return head;
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
