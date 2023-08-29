public class ConstuctTreeUsingPreOrderAndInOrder {

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        // Your code goes here
        return buildTreeHelper(preOrder, 0, preOrder.length - 1, inOrder, 0, inOrder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int preStart, int preEnd,
            int[] inOrder, int inStart, int inEnd) {
        if (preStart > preEnd) {
            return null;
        }

        int rootValue = preOrder[preStart];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootValue);

        int rootIndexInOrder = inStart;
        while (inOrder[rootIndexInOrder] != rootValue) {
            rootIndexInOrder++;
        }

        int leftSubtreeSize = rootIndexInOrder - inStart;

        root.left = buildTreeHelper(preOrder, preStart + 1, preStart + leftSubtreeSize,
                inOrder, inStart, rootIndexInOrder - 1);
        root.right = buildTreeHelper(preOrder, preStart + leftSubtreeSize + 1, preEnd,
                inOrder, rootIndexInOrder + 1, inEnd);

        return root;

        // if (preOrder.length == 0 || inOrder.length == 0) {
        // return null;
        // }

        // return buildTreeHelper(preOrder, 0, preOrder.length - 1, inOrder, 0,
        // inOrder.length - 1);
        // }

        // public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int
        // preStart, int preEnd,
        // int[] inOrder, int inStart, int inEnd) {
        // if (preStart > preEnd || inStart > inEnd) {
        // return null;
        // }

        // int rootValue = preOrder[preStart];
        // BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootValue);

        // int rootIndexInOrder = -1;
        // for (int i = inStart; i <= inEnd; i++) {
        // if (inOrder[i] == rootValue) {
        // rootIndexInOrder = i;
        // break;
        // }
        // }

        // int leftSubtreeSize = rootIndexInOrder - inStart;

        // root.left = buildTreeHelper(preOrder, preStart + 1, preStart +
        // leftSubtreeSize,
        // inOrder, inStart, rootIndexInOrder - 1);
        // root.right = buildTreeHelper(preOrder, preStart + leftSubtreeSize + 1,
        // preEnd,
        // inOrder, rootIndexInOrder + 1, inEnd);

        // return root;

    }

}
