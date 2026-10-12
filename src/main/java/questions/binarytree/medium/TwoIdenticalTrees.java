package questions.binarytree.medium;

import questions.binarytree.Node;

public class TwoIdenticalTrees {

    public static void main(String[] args) {

        /*
                1
               / \
             4     5
            / \   / \
           4   2 6   7

            Inorder:
            Left -> Root -> Right
            Result:
            [[1],[4,5],[4,2,6,7]]
        */
        // Create tree

        Node root1 = new Node(1);
        root1.left = new Node(4);
        root1.right = new Node(5);
        root1.left.left = new Node(4);
        root1.left.right = new Node(2);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);
        root1.right.right.left = new Node(8);


        Node root2 = new Node(1);
        root2.left = new Node(4);
        root2.right = new Node(5);
        root2.left.left = new Node(4);
        root2.left.right = new Node(2);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        root2.right.right.left = new Node(8);

        System.out.println(isSameTrees(root1,root2));
    }

    public static boolean isSameTrees(Node root1,Node root2) {
     // If both nodes are null, they are identical at this branch
        if (root1 == null && root2 == null) {
            return true;
        }

        // If one is null and the other is not, they are different
        if (root1 == null || root2 == null) {
            return false;
        }

        // If data values don't match, they are different
        if (root1.data != root2.data) {
            return false;
        }

        // Recursively check left and right subtrees
        boolean isLeftSame = isSameTrees(root1.left, root2.left);
        boolean isRightSame = isSameTrees(root1.right, root2.right);

        // Both subtrees must be identical
        return isLeftSame && isRightSame;
    }
}
