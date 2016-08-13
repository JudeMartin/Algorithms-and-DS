package DS.LinkedList;
/* https://leetcode.com/problems/odd-even-linked-list/ */
public class OddEvenLinkedList {

	public static ListNode oddEvenList(ListNode head) {
		ListNode odd = head, even = head.next, evenHead = even;
		if (head != null) {
			while (even != null && even.next != null) {
				odd.next = odd.next.next;
				even.next = even.next.next;
				odd = odd.next;
				even = even.next;
			}
			odd.next = evenHead;
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode curr1 = new ListNode(1);
		ListNode curr2 = new ListNode(2);
		ListNode curr3 = new ListNode(3);
		ListNode curr4 = new ListNode(4);
		ListNode curr5 = new ListNode(5);
		ListNode curr6 = new ListNode(6);
		ListNode curr7 = new ListNode(7);

		curr7.next = null;
		curr6.next = curr7;
		curr5.next = curr6;
		curr4.next = curr5;
		curr3.next = curr4;
		curr2.next = curr3;
		curr1.next = curr2;
		ListNode latest = oddEvenList(curr1);

		while (latest != null) {
			System.out.print(latest.val + "->");
			latest = latest.next;
		}
		System.out.print("null");
	}
}
// 1->2->3->4->5-