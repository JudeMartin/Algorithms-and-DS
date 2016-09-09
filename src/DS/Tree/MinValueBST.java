package DS.Tree;

public class MinValueBST {
	public static int minValueBST(TreeNode root) {
		TreeNode current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.val;
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
		insert(root,10);
		insert(root,14);
		insert(root,12);
		insert(root,4);
		insert(root,8);
		insert(root,22); 
		System.out.println(root);
		System.out.println(minValueBST(root));
		
	}
}
