package BST;

import java.util.*;

public class BSTToLL {
    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    /*
     * LinkedList Node Class
     *
     * 
     * class LinkedListNode<T> { T data; LinkedListNode<T> next;
     * 
     * public LinkedListNode(T data) { this.data = data; } }
     */

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        return convert(root).head;
    }

    private static class Result {
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;

        public Result(LinkedListNode<Integer> head, LinkedListNode<Integer> tail) {
            this.head = head;
            this.tail = tail;
        }
    }

    private static Result convert(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        Result leftResult = convert(root.left);
        Result rightResult = convert(root.right);

        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
        Result result = new Result(newNode, newNode);

        if (leftResult != null) {
            leftResult.tail.next = newNode;
            result.head = leftResult.head;
        }

        if (rightResult != null) {
            newNode.next = rightResult.head;
            result.tail = rightResult.tail;
        }

        return result;

    }

}
