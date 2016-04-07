package HackerRank.ThirtyDaysChallenge;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

	public class Day15 {
		public Node insert(Node head, int data) {
			System.out.print(data + " ");
			if (head == null) {
				return head;
			}
			Node start = head;
			while (head != null) {
				head = head.next;
				System.out.print(head.data + "head data");
			}
			Node latestNode = new Node(data);
			latestNode.next = null;
			head.next = latestNode;
			return start;
		}
	}
}