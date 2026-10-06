package questions.binarytree.traversal;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
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
//     //recursive
//    // Inorder Traversal: Left -> Root -> Right
//    static void inorder(TreeNode root, List<Integer> result) {
//
//        // Base case
//        if (root == null) {
//            return;
//        }
//
//        // Left
//        inorder(root.left, result);
//
//        // Root
//        result.add(root.val);
//
//        // Right
//        inorder(root.right, result);
//    }
//
//    public static void main(String[] args) {
//
//        /*
//                 1
//                /
//               4
//              / \
//             4   2
//
//            Inorder:
//            Left -> Root -> Right
//
//            Result:
//            [4, 4, 2, 1]
//        */
//
//        // Create tree
//        TreeNode root = new TreeNode(1);
//
//        root.left = new TreeNode(4);
//
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(2);
//
//        // Store result
//        List<Integer> result = new ArrayList<>();
//
//        // Call inorder traversal
//        inorder(root, result);
//
//        // Print result
//        System.out.println(result);
//    }

//    stack based
public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    // Using Deque as a Stack is recommended over the legacy Stack class
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode curr = root;

    while (curr != null || !stack.isEmpty()) {
        // 1. Reach the leftmost node of the current node
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }

        // 2. Current must be null at this point, so pop from stack
        curr = stack.pop();

        // 3. Add the node's value to the result (Root)
        result.add(curr.val);

        // 4. We have visited the node and its left subtree. Now, it's right subtree's turn.
        curr = curr.right;
    }

    return result;
}

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(2);

        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }

//    //optimized inorder traversal
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        TreeNode curr = root;
//
//        while (curr != null) {
//            if (curr.left == null) {
//                // 1. If there is no left child, visit this node and go right
//                result.add(curr.val);
//                curr = curr.right;
//            } else {
//                // 2. Find the inorder predecessor (rightmost node in the left subtree)
//                TreeNode prev = curr.left;
//                while (prev.right != null && prev.right != curr) {
//                    prev = prev.right;
//                }
//
//                if (prev.right == null) {
//                    // Establish temporary thread/link to the current node
//                    prev.right = curr;
//                    curr = curr.left;
//                } else {
//                    // Thread already exists, break it (restore tree) and visit current node
//                    prev.right = null;
//                    result.add(curr.val);
//                    curr = curr.right;
//                }
//            }
//        }
//        return result;
//    }


}
