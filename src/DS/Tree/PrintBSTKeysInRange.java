package DS.Tree;

public class PrintBSTKeysInRange {
	public static void Print(TreeNode node, int k1, int k2) {

		if (node == null) {
			return;
		}
		
		if (k1 < node.val) {
			Print(node.left, k1, k2);
		}
		
		if (k1 <= node.val && k2 >= node.val) {
			System.out.print(" " + node.val);
		}
		
		if(k2 > node.val) {
			Print(node.right, k1, k2);
		}

	}

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

	public static void main(String[] args) {
		TreeNode root = new TreeNode(20);
		insert(root, 10);
		insert(root, 14);
		insert(root, 12);
		insert(root, 4);
		insert(root, 8);
		insert(root, 22);
		Print(root, 7, 23);
	}
}
