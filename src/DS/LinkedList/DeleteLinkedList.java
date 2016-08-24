package DS.LinkedList;

public class DeleteLinkedList {
	public static ListNode deleteLinkedList(ListNode head) {
		head = null;
		return head;
	}
	public static void printList(ListNode head) {
		System.out.println();
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
		printList(head);
		ListNode deletedList = deleteLinkedList(head);
		printList(deletedList);
	}
}
