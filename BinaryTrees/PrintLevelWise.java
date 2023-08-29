package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        // Your code goes here

        if (root == null) {
            return;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> node = queue.poll();
                System.out.print(node.data);

                if (i < levelSize - 1) {
                    System.out.print(" ");
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            System.out.println();
        }
    }

}
