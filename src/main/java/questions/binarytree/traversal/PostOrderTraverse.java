package questions.binarytree.traversal;

import questions.binarytree.Node;

public class PostOrderTraverse {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        postOrder(root);
    }

    public static void postOrder(Node root){
        if(root ==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
