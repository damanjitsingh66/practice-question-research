package questions.binarytree.traversal;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
    Node(){}
    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

