package DS.Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class test {
	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.push(root);
				res.add(root.val);
				root = root.left;
			} else {
				root = stack.pop().right;
			}
		}
		return res;
	}


	public static List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.push(root);
				res.add(root.val);
				root = root.right;
			} else {
				root = stack.pop().left;
			}
		}
		Collections.reverse(res);
		return res;
	}
}
