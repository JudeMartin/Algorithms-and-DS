package DS.LinkedList;

/* https://leetcode.com/problems/reverse-linked-list/ */
public class ReverseLinkedList {
	public static ListNode reverseLinkedList(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode p1 = head;
		ListNode p2 = p1.next;
		head.next = null;
		while (p1 != null && p2 != null) {
			ListNode t = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = t;
		}
		return p1;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = null;
		System.out.println("List before reversing: ");
		printList(one);
		ListNode reversedList = reverseLinkedList(one);
		System.out.println();
		System.out.println("List after reversing: ");
		printList(reversedList);
	}
}
