package DS.Tree;

public class LowestCommonAncestorBST {
	public static TreeNode lowestCommonAncestorBST(TreeNode root, TreeNode p, TreeNode q) {
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestorBST(root.left, p, q);
		} else if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestorBST(root.right, p, q);
		}
		return root;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out
				.println(lowestCommonAncestorBST(root, root.left, root.right));
	}
}
