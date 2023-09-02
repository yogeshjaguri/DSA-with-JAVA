package BinaryTrees.BST;

import java.util.*;

public class LevelWiseLL {

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
    /*
     * LinkedListNode Class
     * class LinkedListNode<T>
     * {
     * T data;
     * LinkedListNode<T> next;
     * public LinkedListNode(T data)
     * {
     * this.data = data;
     * }
     * }
     */
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root) {
        // Write your code here
        // if (root == null) {
        // return new ArrayList<>();
        // }

        // ArrayList<LinkedListNode<Integer>> result = new ArrayList<>();
        // Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        // queue.add(root);

        // while (!queue.isEmpty()) {
        // int levelSize = queue.size();
        // LinkedListNode<Integer> levelHead = null;
        // LinkedListNode<Integer> prev = null;

        // for (int i = 0; i < levelSize; i++) {
        // BinaryTreeNode<Integer> current = queue.poll();
        // LinkedListNode<Integer> newNode = new LinkedListNode<>(current.data);

        // if (prev == null) {
        // levelHead = newNode;
        // } else {
        // prev.next = newNode;
        // }

        // prev = newNode;

        // if (current.left != null) {
        // queue.add(current.left);
        // }
        // if (current.right != null) {
        // queue.add(current.right);
        // }
        // }

        // result.add(levelHead);
        // }

        // return result;

        ArrayList<LinkedListNode<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedListNode<Integer> levelHead = null;
            LinkedListNode<Integer> current = null;

            for (int i = 0; i < levelSize; i++) {
                BinaryTreeNode<Integer> node = queue.poll();
                if (current == null) {
                    current = new LinkedListNode<>(node.data);
                    levelHead = current;
                } else {
                    current.next = new LinkedListNode<>(node.data);
                    current = current.next;
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            result.add(levelHead);
        }

        return result;
    }

}
