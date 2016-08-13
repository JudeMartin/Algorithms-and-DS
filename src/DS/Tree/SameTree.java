/* https://leetcode.com/problems/same-tree/ */
package DS.Tree;

public class SameTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p != null && q != null) {
			if (p.val == q.val) {
				return isSameTree(p.left, q.left)
						&& isSameTree(p.right, q.right);
			}
		}

		return false;
	}
}
