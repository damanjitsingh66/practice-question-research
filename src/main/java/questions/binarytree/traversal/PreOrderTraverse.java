package questions.binarytree.traversal;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraverse {
    public static void main(String[] args) {

            /*
                 1
                /
               4
              / \
             4   2

            Preorder:
             Root -> Left -> Right

            Result:
            [1,4,4,2]
        */

        // Create tree
        Node root = new Node(1);

        root.left = new Node(4);

        root.left.left = new Node(4);
        root.left.right = new Node(2);

        preOrder(root);

    }

//tc - O(N)
    public static void preOrder(Node root){

        if(root==null){
            return;
        }
        //data
        System.out.println(root.data + " ");

        //left
        preOrder(root.left);

        //right
        preOrder(root.right);

    }

}
