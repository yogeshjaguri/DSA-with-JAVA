package BinaryTrees.BST;

import java.util.*;

public class LCAofBST {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null) {
            return -1;
        }

        if (root.data > a && root.data > b) {
            return getLCA(root.left, a, b);
        } else if (root.data < a && root.data < b) {
            return getLCA(root.right, a, b);
        } else {
            return root.data;
        }
    }
}