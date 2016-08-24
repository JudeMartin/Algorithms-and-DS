package DS.Tree;

public class InorderPreOrder {
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		int preStart = 0;
		int preEnd = preorder.length - 1;
		int inStart = 0;
		int inEnd = inorder.length - 1;

		return construct(preorder, preStart, preEnd, inorder, inStart, inEnd);
	}

	public static TreeNode construct(int[] preorder, int preStart, int preEnd,
			int[] inorder, int inStart, int inEnd) {
		if (preStart > preEnd || inStart > inEnd) {
			return null;
		}

		int val = preorder[preStart];
		System.out.println(val);
		TreeNode p = new TreeNode(val);

		// find parent element index from inorder
		int k = 0;
		for (int i = 0; i < inorder.length; i++) {
			if (val == inorder[i]) {
				k = i;
				break;
			}
		}

		p.left = construct(preorder, preStart + 1, preStart + (k - inStart),
				inorder, inStart, k - 1);
		p.right = construct(preorder, preStart + (k - inStart) + 1, preEnd,
				inorder, k + 1, inEnd);

		return p;
	} 
	public static void main(String[] args) {
		int[] inOrder = { 4, 2, 5, 1, 6, 7, 3, 8 };
		int[] preOrder = { 1, 2, 4, 5, 3, 7, 6, 8 };
		TreeNode root = buildTree(preOrder,inOrder);
		System.out.println(root.toString());
	}
}
