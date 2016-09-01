package DS.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> finalResult = new ArrayList<String>();

		if (root == null) {
			return finalResult;
		}
		List<String> curr = new ArrayList<String>();
		List<List<String>> results = new ArrayList<List<String>>();

		dfs(root, results, curr);
		generateResult(results, finalResult);
		return finalResult;
	}

	public static void dfs(TreeNode root, List<List<String>> list, List<String> curr) {
		curr.add(String.valueOf(root.val));

		if (root.left == null && root.right == null) {
			list.add(curr);
			return;
		}

		if (root.left != null) {
			ArrayList<String> temp = new ArrayList<String>(curr);
			dfs(root.left, list, temp);
		}

		if (root.right != null) {
			ArrayList<String> temp = new ArrayList<String>(curr);
			dfs(root.right, list, temp);
		}
	}

	public static void generateResult(List<List<String>> results, List<String> finalResult) {
		for (List<String> al : results) {
			StringBuilder sb = new StringBuilder();
			sb.append(al.get(0));
			for (int i = 1; i < al.size(); i++) {
				sb.append("->" + al.get(i));
			}
			finalResult.add(sb.toString());
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(2);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(9);
		root.right = new TreeNode(4);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(1);
		root.right.right.left = new TreeNode(11);
		List<String> res = binaryTreePaths(root);
		System.out.println(res.toString());
	}
}
