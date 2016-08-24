package DS.Tree;

public class TreeDimensions {

	public static int size(TreeNode root) {
		// Count the number
		if (root == null) {
			return 0;
		}
		return size(root.left) + 1 + size(root.right);
	}

	public static void deleteTree(TreeNode root) {
		// use postOrder traversal to delete the tree
		if (root == null) {
			return;
		}
		deleteTree(root.left);
		deleteTree(root.right);
		System.out.println("Deleting node: " + root.val);
		root = null;
	}

	public static int maxDepthOrHeight(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepthOrHeight(root.left);
		int rightDepth = maxDepthOrHeight(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}

	public static int countLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return countLeaves(root.right) + countLeaves(root.left);
	}

	public static int diameter(TreeNode root) {
		// find the leftHeight, rHeight for the root
		// repeat the leftHeight and rightHeight for every level
		// check if the root is included in the diameter
		if (root == null) {
			return 0;
		}
		int lHeight = maxDepthOrHeight(root.left);
		int rHeight = maxDepthOrHeight(root.right);

		int lDiameter = diameter(root.left);
		int rDiameter = diameter(root.right);

		return Math.max((lHeight + rHeight + 1), Math.max(lDiameter, rDiameter));
	}

	

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println("The size of the Binary Tree is: " + size(root));
		System.out.println("The Max Depth of height of the Binary Tree is: "
				+ maxDepthOrHeight(root));
		System.out.println("The Diameter of the given tree: " + diameter(root));
		System.out.println("The number of leaves of the Binary Tree is: "
				+ countLeaves(root));
		//List<String> res = binaryTreePaths(root);
		//System.out.println(res.toString());
		deleteTree(root);

	}
}
