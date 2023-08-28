package BinaryTrees;

public class GetSum {
	public static int getSum(BinaryTreeNode<Integer> root) {
		// Your code goes here.
		if (root == null) {
			return 0;
		}
		int leftsum = getSum(root.left);
		int rightsum = getSum(root.right);
		return root.data + leftsum + rightsum;
	}

}
