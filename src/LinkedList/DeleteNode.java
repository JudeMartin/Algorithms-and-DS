package LinkedList;

public class DeleteNode {
	public static void printList(ListNode curr){
		while(curr!=null){
			System.out.print(curr.val+"->");
			curr = curr.next;
		}
		System.out.print("null"+"\n");
	}
	
	public static void deleteNode(ListNode node){
		node.val = node.next.val;
		node.next = node.next.next;
	}
	public static void main(String[] args) {
		/**
		 * create 5 nodes
		 * */
		ListNode curr1 = new ListNode(1);
		ListNode curr2 = new ListNode(1);
		ListNode curr3 = new ListNode(1);
		ListNode curr4 = new ListNode(1);
		ListNode curr5 = new ListNode(1);
		/**
		 * set the values for the nodes
		 * 
		 * */
		curr1.val = 35;
		curr2.val = 13;
		curr3.val = 23;
		curr4.val = 43;
		curr5.val = 53;
		
		/**
		 * create the link
		 * 
		 */
		
		curr1.next = curr2;
		curr2.next = curr3;
		curr3.next = curr4;
		curr4.next = curr5;
		curr5.next = null;
		
		printList(curr1);
		deleteNode(curr4);
		printList(curr1);
	}
}
