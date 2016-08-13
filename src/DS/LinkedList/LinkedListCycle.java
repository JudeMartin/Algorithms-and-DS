package DS.LinkedList;

/* https://leetcode.com/problems/linked-list-cycle/ */
public class LinkedListCycle {
	public static boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		head.next = two;
		two.next = three;
		three.next = four;
		four.next = head;
		System.out.println("Does the list contain cycle: " + hasCycle(head));
	}
}
