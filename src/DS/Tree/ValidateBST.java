package DS.Tree;

public class ValidateBST {
	public static boolean isValidBST(TreeNode root) {
		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean validate(TreeNode root, long min, long max) {
		return (root == null) || (root.val > min && root.val < max) && validate(root.left, min, root.val)
				&& validate(root.right, root.val, max);

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(12);
		root.left.left = new TreeNode(19);
		root.left.right = new TreeNode(16);
		root.left.right.left = new TreeNode(13);
		root.right = new TreeNode(19);
		root.right.left = new TreeNode(10);
		root.right.right = new TreeNode(20);
		System.out.println(isValidBST(root));
	}
}
