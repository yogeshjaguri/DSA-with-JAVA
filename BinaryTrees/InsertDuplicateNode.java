package BinaryTrees;

public class InsertDuplicateNode {

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        // Your code goes here
        if (root == null) {
            return;
        }

        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> temp = root.left;

        root.left = newNode;
        newNode.left = temp;

        insertDuplicateNode(temp);
        insertDuplicateNode(root.right);
    }

}
