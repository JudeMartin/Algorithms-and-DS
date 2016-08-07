package DS.GeeksForGeeks.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {
	// Iterative inOrder Traversal using Stack
	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Stack<TreeNode> s = new Stack<>();
		s.push(root);
		while (!s.isEmpty()) {
			TreeNode top = s.peek();
			if (top.left != null) { // make null check on the left only 
				s.push(top.left);
				top.left = null; // set the left as null after pushing
			} else {
				res.add(top.val);
				System.out.print(top.val + " ");
				s.pop();
				if (top.right != null) {
					s.push(top.right);
				}
			}
		}
		return res;
	}

	// preOrder Traversal

	// postOrder Traversal
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		inorderTraversal(root);
	}
}
// InOrder Traversal:
// always check for the node's left as null
// and when inserting a left node into the stack make its corresponding element
// in the Tree as root
// Exp: To make sure that the left node is visited we do the above step, hence
// next iteration we wont put left in stack again
