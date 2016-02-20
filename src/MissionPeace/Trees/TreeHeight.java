package MissionPeace.Trees;
public class TreeHeight {
	TreeNode root;

	public TreeHeight() {
		root = null;
	}

	public static int getHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

	public static void main(String[] args) {
		TreeHeight tree = new TreeHeight();

		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.left.right = new TreeNode(5);
		int leftHeight = getHeight(tree.root.right);
		int rightHeight = getHeight(tree.root.left);
		int finalHeight = Math.max(leftHeight, rightHeight) + 1;

		System.out.println("The Height of the Tree is: " + finalHeight);
	}
}
