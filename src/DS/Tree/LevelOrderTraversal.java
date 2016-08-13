package DS.Tree;

import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversal {
	void printLevelOrder(TreeNode root) {
		int h = height(root);
		for (int i = 1; i <= h; ++i) {
			printGivenLevel(root, i);
		}
	}

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		/* compute height of each subtree */
		int lheight = height(root.left);
		int rheight = height(root.right);

		/* use the larger one */
		return Math.max(lheight, rheight) + 1;
	}

	/* Print nodes at the given level */
	public void printGivenLevel(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.print(root.val + " ");
		} else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}
	}

	public void printLevelOrderItreative(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			System.out.print(temp.val + " ");
			if (temp.left != null) {
				q.offer(temp.left);
			}
			if (temp.right != null) {
				q.offer(temp.right);
			}
		}
	}

	public static void main(String args[]) {
		LevelOrderTraversal tree = new LevelOrderTraversal();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(9);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(8);
		root.left.right.right = new TreeNode(11);
		root.right.right.left = new TreeNode(2);
		System.out.println("Level order traversal of binary tree is ");
		tree.printLevelOrder(root);
		System.out.println();
		tree.printLevelOrderItreative(root);
	}
}