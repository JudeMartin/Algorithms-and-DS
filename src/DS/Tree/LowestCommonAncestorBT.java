package DS.Tree;

public class LowestCommonAncestorBT {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// This is the base case
		if (root == p || root == q || root == null) {
			return root;
		}

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		// common ancestor found
		if (left != null && right != null) {
			return root;
		}

		// only left child found

		return left != null ? left : right;
		// only right child found

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(4);
		root.right = new TreeNode(9);
		root.left.left = new TreeNode(7);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(6);
		root.left.left.right = new TreeNode(5);
		TreeNode result = lowestCommonAncestor(root, root.left.left.right, root.left.right);
		System.out.println(result.val);
	}
}
