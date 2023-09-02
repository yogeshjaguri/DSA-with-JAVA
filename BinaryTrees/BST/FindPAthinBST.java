package BinaryTrees.BST;

import java.util.*;

public class FindPAthinBST {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> {
     * T data;
     * BinaryTreeNode<T> left;
     * BinaryTreeNode<T> right;
     * public BinaryTreeNode(T data)
     * {
     * this.data = data;
     * }
     * }
     */

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        ArrayList<Integer> path = new ArrayList<>();
        findPath(root, data, path);
        return path;
    }

    private static boolean findPath(BinaryTreeNode<Integer> root, int data, ArrayList<Integer> path) {
        if (root == null) {
            return false;
        }

        if (root.data == data || findPath(root.left, data, path) || findPath(root.right, data, path)) {
            path.add(root.data);
            return true;
        }

        return false;
    }

}
