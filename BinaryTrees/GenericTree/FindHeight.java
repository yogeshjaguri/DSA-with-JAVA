package GenericTree;

import javax.swing.tree.TreeNode;

public class FindHeight {

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

    public static int getHeight(TreeNode<Integer> root) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        if (root == null) {
            return 0;
        }

        int maxChildHeight = 0;

        for (TreeNode<Integer> child : root.children) {
            int childHeight = getHeight(child);
            maxChildHeight = Math.max(maxChildHeight, childHeight);
        }

        return maxChildHeight + 1;

    }

}
