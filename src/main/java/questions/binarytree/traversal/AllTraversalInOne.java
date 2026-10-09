package questions.binarytree.traversal;

import questions.binarytree.Node;

import java.util.ArrayList;
import java.util.List;

public class AllTraversalInOne {
    public static void main(String[] args) {
        /*
                 1
               /   \
             2       3
           /  \    /   \
         4     5  6     7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> preOrder = new ArrayList<>();
        List<Integer> inOrder = new ArrayList<>();
        List<Integer> postOrder = new ArrayList<>();


        traverse(root,preOrder,inOrder,postOrder);
        result.add(preOrder);
        result.add(inOrder);
        result.add(postOrder);

        System.out.println(result);
    }
    public static void traverse(Node root, List<Integer> preOrder, List<Integer> inOrder, List<Integer> postOrder){

        if(root==null){
            return;
        }

        preOrder.add(root.data);

        traverse(root.left,preOrder,inOrder,postOrder);

        inOrder.add(root.data);

        traverse(root.right,preOrder,inOrder,postOrder);

        postOrder.add(root.data);
    }

}
