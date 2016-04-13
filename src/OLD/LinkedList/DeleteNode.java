package OLD.LinkedList;

public class DeleteNode {
	public static void printList(ListNode curr){
		if(curr==null){
			return;
		}
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
		 * create 5 nodes and the interger values;
		 * */
		ListNode curr1 = new ListNode(1);
		ListNode curr2 = new ListNode(21);
		ListNode curr3 = new ListNode(11);
		ListNode curr4 = new ListNode(13);
		ListNode curr5 = new ListNode(11);
		
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
