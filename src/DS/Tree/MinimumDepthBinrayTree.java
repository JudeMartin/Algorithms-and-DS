package DS.Tree;

public class MinimumDepthBinrayTree {
	public static int minimumDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.right == null && root.left == null) {
			return 1;
		}
		if (root.right == null) {
			return minimumDepth(root.left) + 1;
		}
		if(root.left == null) {
			return minimumDepth(root.right) + 1;
		}
		return Math.min(minimumDepth(root.left),minimumDepth(root.right)) + 1;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(minimumDepth(root));
	}
}
