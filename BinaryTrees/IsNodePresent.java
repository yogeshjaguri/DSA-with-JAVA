package BinaryTrees;

import BinaryTrees.Improvement on Tree Input.BinaryTreeNode;

public class IsNodePresent {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root == null){
			return false;
		}
		if(root.data == x){
			return true;
		}
		return isNodePresent(root.left, x) || isNodePresent(root.right, x);
		
	}
    
}
