package OLD.HackerRank.ThirtyDaysChallenge.w;

import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
	class Node {
		Node left, right;
		int data;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static void levelOrder(Node root) {
		// Write your code here
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data + " ");
			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}
		}
	}
}
/*
 * Idea is to use a Queue and add the root to the queue (add the actual node not the data)
 * 		a) remove one element from the queue and then print
 * 		b) two null check's one each for the left and the right
 */
