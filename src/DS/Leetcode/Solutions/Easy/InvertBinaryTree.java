/* https://leetcode.com/problems/invert-binary-tree/ */
package DS.Leetcode.Solutions.Easy;

public class InvertBinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode invertTree(TreeNode root) {

		if (root == null)
			return root;

		TreeNode temp = root.left;

		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);

		return root;
	}
}
