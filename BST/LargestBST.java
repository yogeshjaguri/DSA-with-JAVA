package BST;

public class LargestBST {

    public class Solution {
        /*
         * BinaryTreeNode class
         * 
         * class BinaryTreeNode<T>
         * {
         * T data;
         * BinaryTreeNode<T> left;
         * BinaryTreeNode<T> right;
         * public BinaryTreeNode(T data)
         * {
         * this.data = data;
         * }
         * }
         */

        private static class Info {
            boolean isBST;
            int height;
            int minValue;
            int maxValue;

            Info(boolean isBST, int height, int minValue, int maxValue) {
                this.isBST = isBST;
                this.height = height;
                this.minValue = minValue;
                this.maxValue = maxValue;
            }
        }

        public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
            // Write your code here
            Info result = largestBSTSubtreeHelper(root);
            return result.height;
        }

        private static Info largestBSTSubtreeHelper(BinaryTreeNode<Integer> root) {
            if (root == null) {
                return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
            }

            Info leftInfo = largestBSTSubtreeHelper(root.left);
            Info rightInfo = largestBSTSubtreeHelper(root.right);

            boolean isBST = leftInfo.isBST && rightInfo.isBST &&
                    root.data > leftInfo.maxValue && root.data < rightInfo.minValue;

            int height = isBST ? Math.max(leftInfo.height, rightInfo.height) + 1
                    : Math.max(leftInfo.height, rightInfo.height);

            return new Info(isBST, height, Math.min(root.data, leftInfo.minValue),
                    Math.max(root.data, rightInfo.maxValue));
        }
    }
}
