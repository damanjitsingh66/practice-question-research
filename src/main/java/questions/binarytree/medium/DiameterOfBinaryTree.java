package questions.binarytree.medium;

public class DiameterOfBinaryTree {

        static class Node {
            int data;
           Node left;
           Node right;

            Node(int data) {
                this.data = data;
            }
        }
        static int maxDiameter = 0;
        public static int height(Node root) {
            if (root == null) {
                return -1;
            }

            int left = height(root.left);
            int right = height(root.right);

            int currentDiameter = left + right + 2;

            maxDiameter = Math.max(maxDiameter,currentDiameter);

            return 1 + Math.max(left, right);
        }

        public static void main(String[] args) {
          Node root = new Node(5);

            root.left = new Node(1);
            root.right = new Node(2);

            root.left.left = new Node(8);
            root.left.right = new Node(3);
            root.left.left.right = new Node(4);

            root.right.right = new Node(5);

            int diameter = height(root);

            System.out.println("max diameter is :- "+maxDiameter);


        }
        //tc-O(N)
    //sc - O(H)
}
