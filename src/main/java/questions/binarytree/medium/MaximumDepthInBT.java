package questions.binarytree.medium;

import questions.binarytree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthInBT {
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

        Node root = new Node(1);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(2);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(8);
        System.out.println(levelOrder(root));
    }

//    public static int levelOrder(Node root) {
//        // 1. Handle edge case for an empty tree
//        if (root == null) {
//            return 0;
//        }
//
//        Queue<Node> queue = new ArrayDeque<>();
//        queue.offer(root);
//        int depth = 0;
//
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//
//            for (int i = 0; i < size; i++) {
//                Node curr = queue.poll(); // Poll the current node safely
//
//                if (curr.left != null) {
//                    queue.offer(curr.left);
//                }
//                if (curr.right != null) {
//                    queue.offer(curr.right);
//                }
//            }
//            // After processing an entire level, increment depth
//            depth++;
//        }
//        return depth;
//    }
    //current brute force tc - O(N)

    //more percise recursive
    public static int levelOrder(Node root) {
        // Base case: if tree/subtree is empty, depth is 0
        if (root == null) {
            return 0;
        }

        // Recursively find the depth of left and right subtrees
        int leftDepth = levelOrder(root.left);
        int rightDepth = levelOrder(root.right);

        // The max depth is the greater of the two depths, plus 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
    //tc- O(N)&& sc - O(w)
}
