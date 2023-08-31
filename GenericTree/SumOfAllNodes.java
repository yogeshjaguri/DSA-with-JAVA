package GenericTree;

import javax.swing.tree.TreeNode;

public class SumOfAllNodes {

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

    public static int sumOfAllNode(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int sum = root.data;
        for (TreeNode<Integer> child : root.children) {
            sum += sumOfAllNode(child);
        }

        return sum;

    }

}
