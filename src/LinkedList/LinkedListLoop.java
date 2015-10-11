package LinkedList;

public class LinkedListLoop {
	public static void printList(ListNode curr){
		/*Iterate throughout the list and print each node 
		 * */
		if(curr==null){
			return;
		}
		while(curr!=null){
			System.out.print(curr.val+"->");
			curr = curr.next;
		}
		System.out.print("null"+"\n");
	}
	public static boolean detectLoop(ListNode head){
/*
 * Fast and slow pointer => Floyd Algorithm
 * */
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
			/*
			 * if they meet there is a loop
			 * */
			
			if(slow==fast){
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		ListNode curr1 = new ListNode(1);
		ListNode curr2 = new ListNode(2);
		ListNode curr3 = new ListNode(3);
		ListNode curr4 = new ListNode(11);
		ListNode curr5 = new ListNode(61);
		ListNode curr6 = new ListNode(91);
		
		curr1.next = curr2;
		curr2.next = curr3;
		curr3.next = curr4;
		curr4.next = curr5;
		curr5.next = curr2;
		
		//curr6.next = curr1;
		
		boolean res = detectLoop(curr1);
		System.out.println(res);
		//printList(curr1);
	}
}
