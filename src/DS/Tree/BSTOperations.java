package DS.Tree;

public class BSTOperations {
	// insert a node in BST
	public static TreeNode insert(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (val <= root.val) {
			root.left = insert(root.left, val);
		} else {
			root.right = insert(root.right, val);
		}
		return root;
	}

	public static TreeNode deleteRec(TreeNode root, int key) {
		/* Base Case: If the tree is empty */
		if (root == null) {
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.val) {
			root.left = deleteRec(root.left, key);
		}
		else if (key > root.val) {
			root.right = deleteRec(root.right, key);
		}

		// if key is same as root's key, then This is the node
		// to be deleted
		else {
			// node with only one child or no child
			if (root.left == null) {
				return root.right;
			}
			else if (root.right == null) {
				return root.left;
			}
			// node with two children: Get the inorder successor (smallest
			// in the right subtree)
			root.val = minValue(root.right);

			// Delete the inorder successor
			root.right = deleteRec(root.right, root.val);
		}

		return root;
	}

	public static int minValue(TreeNode root) {
		int minv = root.val;
		while (root.left != null) {
			minv = root.left.val;
			root = root.left;
		}
		return minv;
	}

	// print in ascending order
	public static void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.val);
			inOrder(root.right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = null;
		root = insert(root, 50);
		insert(root, 30);
		insert(root, 70);
		insert(root, 20);
		insert(root, 40);
		insert(root, 60);
		insert(root, 80);
		inOrder(root);
		deleteRec(root, 20);
		System.out.println("deleted node 20");
		inOrder(root);
		
		deleteRec(root, 30);
		System.out.println("deleted node 30");
		inOrder(root);
		
		deleteRec(root, 50);
		System.out.println("deleted node 50");
		inOrder(root);
		
		
		
	}
}
