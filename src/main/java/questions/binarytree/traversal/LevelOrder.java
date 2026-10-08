package questions.binarytree.traversal;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

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
        Node root = new Node(1);

        root.left = new Node(4);

        root.left.left = new Node(4);
        root.left.right = new Node(2);

        List<List<Integer>> result =  levelOrder(root);

        result.forEach(System.out::println);
    }
    public static List<List<Integer>> levelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<>();
        if(root == null) return wrapList;
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }
            return wrapList;
    }



}
