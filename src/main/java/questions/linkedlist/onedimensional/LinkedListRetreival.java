package questions.linkedlist.onedimensional;

public class LinkedListRetreival {

    public static void main(String[] args) {

      Node linkedList = new Node(1);
      linkedList.next = new Node(2);
      linkedList.next.next = new Node(3);

      Node res = linkedList;
      while(res!=null){
          System.out.println(res.data);
           res = res.next;
      }

    }





}
