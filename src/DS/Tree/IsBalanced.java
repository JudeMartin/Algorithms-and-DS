package DS.Tree;

public class IsBalanced {
	public static boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isBalanced(root.left) && isBalanced(root.right)
				&& (Math.abs(height(root.left) - height(root.right)) <= 1);
	}

	public static int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		System.out.println(isBalanced(root));
	}
}
