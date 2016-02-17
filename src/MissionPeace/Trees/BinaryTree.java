package MissionPeace.Trees;

class NodeRef {
	Node node;
}

enum Color {
	RED, BLACK;
}

class Node {

	Node left;
	Node right;
	Node next; // not sure why -> needs clarification
	int data;
	int lis; // not sure why -> needs clarification
	int height;
	int size;
	Color color;

	public static Node newNode(int data) {
		Node n = new Node();
		n.left = null;
		n.right = null;
		n.data = data; // passed into the current method()
		n.lis = -1; // not sure why -> needs clarification
		n.size = 1; //
		n.color = Color.RED;
		return n;
	}

}

public class BinaryTree {
	Node addNode(int data, Node head) {
		Node tempHead = head;
		Node n = Node.newNode(data);
		if (head == null) {
			head = n;
			return head;
		}
		Node prev = null; // not sure why -> needs clarification
		while (head != null) {
			prev = head;
			if (head.data < data) {
				head = head.right;
			} else {
				head = head.left;
			}
		}
		if (prev.data < data) {
			prev.right = n;
		} else {
			prev.left = n;
		}
		return tempHead;
	}

	class IntegerRef {
		int height;
	}

	public int height(Node root) {
		if (root == null) {
			return 0;
		}
		int leftHeigth = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeigth, rightHeight) + 1;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		Node head = null;
		head = bt.addNode(10, head);
		head = bt.addNode(15, head);
		head = bt.addNode(5, head);
		head = bt.addNode(7, head);
		head = bt.addNode(19, head);
		head = bt.addNode(20, head);
		head = bt.addNode(-1, head);
		head = bt.addNode(21, head);
		System.out.println(bt.height(head));
	}
}

/* Methods in Node class */
	//newNode(what to add)

/* Methods in Binary Tree class */
	// addNode(what to add, where to start) 
	// height(where to start)
/* Enum's and ref */
	// color : red,black -> always in capital letters
	// NodeRef : Node node

/* main */
	// head as null
	// addNode pass the value and the head ptr.
	// print the height using the head.
/* Notes: */
	// complicated method : addNode() while(){if(){}else{} }if(){}else{} // setting the head and prev respectively 
	// needs clarification though 