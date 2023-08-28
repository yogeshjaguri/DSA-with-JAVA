package BinaryTrees;

import BinaryTrees.Improvement on Tree Input.BinaryTreeNode;

public class ChangetoDepth {

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    //Your code goes here
		 changeToDepthTreeHelper(root, 0);
    }

    private static void changeToDepthTreeHelper(BinaryTreeNode<Integer> root, int depth) {
        if (root == null) {
            return; 
        }

        root.data = depth;

        changeToDepthTreeHelper(root.left, depth + 1);
        changeToDepthTreeHelper(root.right, depth + 1);
	}

}
