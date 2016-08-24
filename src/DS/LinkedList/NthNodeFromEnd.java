package DS.LinkedList;

public class NthNodeFromEnd {
	public static ListNode NthNodeFromEnd(ListNode head, int k) {
		ListNode fast = head;
		ListNode slow = head;
		if (head == null) {
			return null;
		}
		while (k-- > 0) {
			fast = fast.next;
		}
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(5);	
		head.next = new ListNode(4);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(7);
		System.out.println(NthNodeFromEnd(head, 3).val);
	}
}
