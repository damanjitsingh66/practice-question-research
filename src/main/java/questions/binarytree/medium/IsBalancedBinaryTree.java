package questions.binarytree.medium;

import questions.binarytree.Node;

public class IsBalancedBinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return -1;
        }

        int left = height(root.left);
        int right = height(root.right);

        if (left == -2 || right == -2) {
            return -2;
        }

        if (Math.abs(left - right) > 1) {
            return -2;
        }

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(4);
        root.right = new Node(5);

        root.left.left = new Node(4);
        root.left.right = new Node(2);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int result = height(root);

        System.out.println("Height: " + result);
        System.out.println("Balanced: " + (result != -2));
    }
}