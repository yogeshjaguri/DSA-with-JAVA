package GenericTree;

public class replacedepthvalue {

	/*
	 * TreeNode structure
	 * 
	 * class TreeNode<T> {
	 * T data;
	 * ArrayList<TreeNode<T>> children;
	 * 
	 * TreeNode(T data){
	 * this.data = data;
	 * children = new ArrayList<TreeNode<T>>();
	 * }
	 * }
	 */

	public static void replaceWithDepthValue(TreeNode<Integer> root) {

		// Write your code here

		replaceWithDepthValue(root, 0);
	}

	public static void replaceWithDepthValue(TreeNode<Integer> root, int depth) {
		if (root == null) {
			return;
		}

		root.data = depth;

		for (TreeNode<Integer> child : root.children) {
			replaceWithDepthValue(child, depth + 1);
		}
	}

}
