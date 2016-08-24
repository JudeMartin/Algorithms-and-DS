package DS.LinkedList;

public class MiddleLinkedList {
	public static ListNode getMiddleLinkedList(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
		}
		return slow;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		head.next = new ListNode(4);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(7);
		//head.next.next.next.next = new ListNode(17);
		printList(head);
		System.out.println();
		System.out.println("Middle of the LinkedList: "
				+ getMiddleLinkedList(head).val);
	}
}
