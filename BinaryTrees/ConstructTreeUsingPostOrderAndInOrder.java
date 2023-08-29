package BinaryTrees;

public class ConstructTreeUsingPostOrderAndInOrder {

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        // Your code goes here
        return buildTreeHelper(postOrder, inOrder, 0, postOrder.length - 1, 0, inOrder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] postOrder, int[] inOrder,
            int postStart, int postEnd,
            int inStart, int inEnd) {
        if (postStart > postEnd || inStart > inEnd) {
            return null;
        }

        int rootValue = postOrder[postEnd];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootValue);

        int rootIndexInOrder = inStart;
        while (inOrder[rootIndexInOrder] != rootValue) {
            rootIndexInOrder++;
        }

        int leftSubtreeSize = rootIndexInOrder - inStart;

        root.left = buildTreeHelper(postOrder, inOrder, postStart, postStart + leftSubtreeSize - 1,
                inStart, rootIndexInOrder - 1);
        root.right = buildTreeHelper(postOrder, inOrder, postStart + leftSubtreeSize, postEnd - 1,
                rootIndexInOrder + 1, inEnd);

        return root;
    }

}
