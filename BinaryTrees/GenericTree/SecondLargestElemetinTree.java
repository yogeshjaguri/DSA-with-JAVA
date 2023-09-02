package GenericTree;

import javax.swing.tree.TreeNode;

public class SecondLargestElemetinTree {

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

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {

        // Write your code here

        if (root == null || (root.children.size() == 0 && root.data != null)) {
            return null;
        }

        TreeNode<Integer> firstLargest = new TreeNode<>(null);
        TreeNode<Integer> secondLargest = new TreeNode<>(null);

        findSecondLargestUtil(root, firstLargest, secondLargest);

        return secondLargest.data != null ? secondLargest : null;
    }

    private static void findSecondLargestUtil(TreeNode<Integer> root, TreeNode<Integer> firstLargest,
            TreeNode<Integer> secondLargest) {
        if (root == null) {
            return;
        }

        if (firstLargest.data == null || root.data > firstLargest.data) {
            secondLargest.data = firstLargest.data;
            firstLargest.data = root.data;
        } else if ((secondLargest.data == null || root.data > secondLargest.data) && root.data != firstLargest.data) {
            secondLargest.data = root.data;
        }

        for (TreeNode<Integer> child : root.children) {
            findSecondLargestUtil(child, firstLargest, secondLargest);
        }

    }

}
