package MissionPeace.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public void levelOrderTraversal(Node root) {
		if (root == null) {
			System.out.println("Enter a valid Tree!");
			return;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.data + " ");
			if (root.left != null) {
				queue.offer(root.left);
			}
			if (root.right != null) {
				queue.offer(root.right);
			}
		}
	}

	public static void main(String[] args) {
		LevelOrderTraversal lot = new LevelOrderTraversal();
		BinaryTree bt = new BinaryTree();
		Node head = null;
		/*head = bt.addNode(10, head);
		head = bt.addNode(15, head);
		head = bt.addNode(5, head);
		head = bt.addNode(7, head);
		head = bt.addNode(19, head);
		head = bt.addNode(20, head);
		head = bt.addNode(-1, head);*/
		System.out.println("Printing the Level Order of the Tree:");
		lot.levelOrderTraversal(head);
	}

}
/* https://github.com/mission-peace/interview/blob/master/src/com/interview/tree/LevelOrderTraversal.java */
/* levelOrderTraversal()  -> use a queue with the LinkedList implementation */
	//poll() and offer()
	// while Q is not empty get the element
	// print , add - > { the left and then the right } -> checks for nulls
	// size or isEmpty -> which one is a costly operation -> needs clarification ?
