package questions.binarytree.traversal;


import java.util.ArrayList;
import java.util.List;

public class InOrderSolution {

    // Tree Node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Inorder Traversal: Left -> Root -> Right
    static void inorder(TreeNode root, List<Integer> result) {

        // Base case
        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, result);

        // Root
        result.add(root.val);

        // Right
        inorder(root.right, result);
    }

    public static void main(String[] args) {

        /*
                 1
                /
               4
              / \
             4   2

            Inorder:
            Left -> Root -> Right

            Result:
            [4, 4, 2, 1]
        */

        // Create tree
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(4);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        // Store result
        List<Integer> result = new ArrayList<>();

        // Call inorder traversal
        inorder(root, result);

        // Print result
        System.out.println(result);
    }

}
