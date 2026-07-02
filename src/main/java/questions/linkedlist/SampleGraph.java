package questions.linkedlist;

public class SampleGraph {

    public static void main(String[] args) {

        int[] arr = {2,5,8,7};

        Node2 y = new Node2(arr[0]);

        System.out.println(y);

        System.out.println(y.data);
    }
}

class Node{
    int data;
    Node2 next;

  Node(int data1, Node2 next1){
      data = data1;
      next = next1;
  }

  Node(int data1){
      data = data1;
      next = null;
  }
}
