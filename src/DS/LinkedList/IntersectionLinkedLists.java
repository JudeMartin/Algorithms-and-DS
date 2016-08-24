package DS.LinkedList;

/* https://leetcode.com/problems/intersection-of-two-linked-lists/ */
public class IntersectionLinkedLists {
	public static ListNode getIntersectingNode(ListNode head1, ListNode head2) {
		if (head1 == null || head2 == null) {
			return null;
		}
		ListNode p1 = head1;
		ListNode p2 = head2;
		int l1Length = length(head1);
		int l2Length = length(head2);
		if (l1Length > l2Length) {
			int diff = Math.abs(l1Length - l2Length);

			for (int i = 0; i < diff; i++) {
				p1 = p1.next;
			}
		} else {
			int diff = Math.abs(l1Length - l2Length);

			for (int i = 0; i < diff; i++) {
				p2 = p2.next;
			}
		}
		while (p1 != null && p2 != null) {
			if (p1.val == p2.val) {
				return p1;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return null;
	}

	public static int length(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}
}
