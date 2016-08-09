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
	//Iterative InOrder without stack : Morri's Traversal
	public static List<Integer> morrisInOrderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if(root == null) {
			return res;
		}
		TreeNode curr = root;
		while(curr != null) {
			if(curr.left == null) {
				res.add(curr.val);
				curr = curr.right;
			} else {
				TreeNode predecessor = curr.left;
				while(predecessor.right != null && predecessor.right != curr) {
					predecessor = predecessor.right;
				}
				if(predecessor.right == null) {
					predecessor.right = curr;
					curr = curr.left;
				} else {
					predecessor.right = null;
					res.add(curr.val);
					curr = curr.right;
				}
			}
		}
		return res;
	}
	// preOrder Morris Traversal: in the null check just print the val instead of the else block 
	public static List<Integer> morrisPreOrderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if(root == null) {
			return res;
		}
		TreeNode curr = root;
		while(curr != null) {
			if(curr.left == null) {
				res.add(curr.val);
				curr = curr.right;
			} else {
				TreeNode predecessor = curr.left;
				while(predecessor.right != null && predecessor.right != curr) {
					predecessor = predecessor.right;
				}
				if(predecessor.right == null) {
					predecessor.right = curr;
					res.add(curr.val);
					curr = curr.left;
				} else {
					predecessor.right = null;
					curr = curr.right;
				}
			}
		}
		return res;
	}
	// postOrder Traversal
	
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		//inorderTraversal(root);
		List<Integer> res = morrisInOrderTraversal(root);
		System.out.println(res.toString());
		List<Integer> res1 = morrisPreOrderTraversal(root);
		System.out.println(res1.toString());
	}
}