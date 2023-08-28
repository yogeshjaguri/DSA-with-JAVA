package BinaryTrees;

import BinaryTrees.Improvement on Tree Input.BinaryTreeNode;

public class MirrorBinaryTree {
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
		if(root == null){
			return;
		}
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;

		mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
    
}
