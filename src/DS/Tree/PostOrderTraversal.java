package DS.Tree;

import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class PostOrderTraversal {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		if (root == null)
			return result;
		Stack<TreeNode> s1 = new Stack<TreeNode>();
		Stack<TreeNode> s2 = new Stack<TreeNode>();
		s1.push(root);
		while (!s1.isEmpty()) {
			root = s1.pop();
			s2.push(root);
			if (root.left != null) {
				s1.push(root.left);
			}
			if (root.right != null) {
				s1.push(root.right);
			}
		}

		while (!s2.isEmpty()) {
			TreeNode Temp = s2.pop();
			result.add(Temp.val);
		}
		return result;
	}
}
