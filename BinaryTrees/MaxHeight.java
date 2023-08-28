package BinaryTrees;

public class MaxHeight {
    public static int height(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
