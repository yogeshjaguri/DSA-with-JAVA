package BinaryTrees.BST;

import java.util.*;

public class ReplacewithSumofGreaterNodes {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Write your code here

        if (root == null) {
            return;
        }

        Stack<BinaryTreesreeNode<Integer>> stack = new Stack<>();
        BinaryTreeNode<Integer> current = root;
        int runningSum = 0;

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.right;
            }

            current = stack.pop();
            current.data += runningSum;
            runningSum = current.data;

            current = current.left;
        }

    }
}