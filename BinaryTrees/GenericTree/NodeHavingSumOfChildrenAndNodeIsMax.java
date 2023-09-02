package GenericTree;

import javax.swing.tree.TreeNode;

public class NodeHavingSumOfChildrenAndNodeIsMax {

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

    private static class MaxSumNodeInfo {
        TreeNode<Integer> node;
        int sum;

        MaxSumNodeInfo(TreeNode<Integer> node, int sum) {
            this.node = node;
            this.sum = sum;
        }
    }

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        MaxSumNodeInfo maxInfo = maxSumNodeHelper(root);
        return maxInfo.node;
    }

    private static MaxSumNodeInfo maxSumNodeHelper(TreeNode<Integer> root) {
        if (root == null) {
            return new MaxSumNodeInfo(null, 0);
        }

        int sum = root.data;
        for (TreeNode<Integer> child : root.children) {
            sum += child.data;
        }

        MaxSumNodeInfo maxInfo = new MaxSumNodeInfo(root, sum);

        for (TreeNode<Integer> child : root.children) {
            MaxSumNodeInfo childInfo = maxSumNodeHelper(child);
            if (childInfo.sum > maxInfo.sum) {
                maxInfo = childInfo;
            }
        }

        return maxInfo;
    }

}
