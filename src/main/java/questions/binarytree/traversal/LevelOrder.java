package questions.binarytree.traversal;

import questions.binarytree.Node;

import java.util.*;

public class LevelOrder {

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

        List<List<Integer>> result = levelOrder(root);

        result.forEach(System.out::println);
    }

    public static List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> result = new ArrayList<>();
    Queue<Node> queue = new ArrayDeque<>();
    queue.offer(root);

    while(!queue.isEmpty()){
        int size = queue.size();
        List<Integer> subResultList = new ArrayList<>();
        for(int i=0;i<size;i++){
               if(queue.peek().left!=null) queue.offer(queue.peek().left);
               if(queue.peek().right!=null) queue.offer(queue.peek().right);
               subResultList.add(queue.poll().data);
        }
        result.add(subResultList);
    }
    return result;
    }
}
