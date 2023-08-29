package BST;

public class BSTfromSortedArray {

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
        return sortedArrayToBST(arr, 0, n - 1);
    }

    private static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

        root.left = sortedArrayToBST(arr, start, mid - 1);
        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }

    public static void printPreOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);

    }

}
