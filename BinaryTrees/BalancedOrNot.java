package BinaryTrees;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BalancedOrNot {

    // Function to calculate the height of a binary tree
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Function to check if a binary tree is balanced
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true; // An empty tree is considered balanced
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Check if the heights of left and right subtrees differ by at most 1
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        // Recursively check for balance in left and right subtrees
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        // Assuming you have the input as described in the problem
        // Construct the binary tree from the input

        // Call the isBalanced function with the root node
        boolean balanced = isBalanced(root);

        if (balanced) {
            System.out.println("The binary tree is balanced.");
        } else {
            System.out.println("The binary tree is not balanced.");
        }
    }
}
