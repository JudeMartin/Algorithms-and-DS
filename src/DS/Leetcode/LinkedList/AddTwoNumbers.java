package DS.Leetcode.LinkedList;

public class AddTwoNumbers {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1; /* Least Significant bit - Head of the LL */
		ListNode q = l2; /* Least Significant bit - Head of the LL */
		ListNode curr = dummyHead; /* result LL */
		int carry = 0; /* initial carry as 0 */
		while (p != null || q != null) {
			/* update values as long as they have not reached the end */
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			/* update sum */
			int sum = carry + x + y;
			/* update carry by div of the above sum */
			carry = sum / 10;
			/* create a new node for curr's next with the sum % */
			curr.next = new ListNode(sum % 10);
			/* inc curr */
			curr = curr.next;
			/* inc p & q as long as they have not reached the end */
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		/* Since carry is greater than one create a node and append */
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}
