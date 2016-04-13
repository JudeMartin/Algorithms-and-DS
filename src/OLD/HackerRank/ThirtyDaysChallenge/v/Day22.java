package OLD.HackerRank.ThirtyDaysChallenge.v;

public class Day22 {
	class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static int getHeight(Node root) {
		// Write your code here
		if (root == null) {
			return 0;
		}
		int leftHeight = getHeight(root.left);
		int rightHeight = getHeight(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

}
/*
 * Get the left height and the right height -> recursively 
 * 	then add one taking the root element into consideration.
 * 	finally max of the left and the right heights
 * ***** Breaking condition is when reaching the last element , hence it becomes null - return as zero    **
 * 
 * 
 * */
 