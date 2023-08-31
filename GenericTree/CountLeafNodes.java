package GenericTree;

import javax.swing.tree.TreeNode;

public class CountLeafNodes {

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

    public static int countLeafNodes(TreeNode<Integer> root) {

        // Write your code here

        if (root == null) {
            return 0;
        }

        if (root.children.size() == 0) {
            return 1;
        }

        int leafCount = 0;

        for (TreeNode<Integer> child : root.children) {
            leafCount += countLeafNodes(child);
        }

        return leafCount;

    }

}
