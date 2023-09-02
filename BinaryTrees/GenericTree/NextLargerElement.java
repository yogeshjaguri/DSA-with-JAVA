package GenericTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class NextLargerElement {

    /*
     * TreeNode structure
     * 
     * class TreeNode<T> {
     * T data;
     * ArrayList<TreeNode<T>> children;
     * 
     * TreeNode(T data){
     * this.data = data;
     * children = new ArrayList<TreeNode<T>>();
     * }
     * }
     */

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {

        // Write your code here

        if (root == null) {
            return null;
        }

        TreeNode<Integer> nextLargerNode = null;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.poll();

            if (current.data > n) {
                if (nextLargerNode == null || current.data < nextLargerNode.data) {
                    nextLargerNode = current;
                }
            }

            for (TreeNode<Integer> child : current.children) {
                queue.add(child);
            }
        }

        return nextLargerNode;

    }

}
