package DS.LinkedList;

public class MergeSortedList {
	public static ListNode mergeSortedLists(ListNode head1, ListNode head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		ListNode head = new ListNode(0);
		ListNode curr = head;
		while (head1 != null || head2 != null) {
			if (head1 != null && head2 != null) {
				if (head1.val < head2.val) {
					curr.next = head1;
					head1 = head1.next;
				} else {
					curr.next = head2;
					head2 = head2.next;
				}
				curr = curr.next;
			} else if (head1 != null) {
				curr.next = head1;
				break;
			} else if (head2 != null) {
				curr.next = head2;
				break;
			}
		}
		return head.next;
	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(5);
		head1.next.next.next = new ListNode(7);
		System.out.println("List1 before merging");
		printList(head1);

		ListNode head2 = new ListNode(2);
		head2.next = new ListNode(4);
		head2.next.next = new ListNode(6);
		head2.next.next.next = new ListNode(8);
		System.out.println();
		System.out.println("List2 before merging");
		printList(head2);

		ListNode mergedList = mergeSortedLists(head1, head2);
		System.out.println();
		System.out.println("Merged List: ");
		printList(mergedList);

	}
}
