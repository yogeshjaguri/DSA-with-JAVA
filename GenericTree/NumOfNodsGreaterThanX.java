package GenericTree;

import javax.swing.tree.TreeNode;

public class NumOfNodsGreaterThanX {
    /*
     * TreeNode class
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

    public static int numNodeGreater(TreeNode<Integer> root, int x) {

        // Write your code here
        if (root == null) {
            return 0;
        }

        int count = root.data > x ? 1 : 0;

        for (TreeNode<Integer> child : root.children) {
            count += numNodeGreater(child, x);
        }

        return count;
    }

}
