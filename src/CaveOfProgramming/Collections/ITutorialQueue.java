package CaveOfProgramming.Collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ITutorialQueue {
	public static void main(String[] args) {

		Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
		
		System.out.println("******************    add(e), remove(), element(): throws Exception    *****************");
		/* add(e), remove(), element() */
		q1.add(14);
		q1.add(21);
		q1.add(1);

		System.out.println("**** added elements ****");
		for (Integer q : q1) {
			System.out.println(q);
		}

		System.out.println("**** removed top element ****");
		q1.remove();
		for (Integer q : q1) {
			System.out.println(q);
		}
		System.out.println("**** Top of Queue element ****");
		System.out.println(q1.element());
		
		Queue<Integer> q2 = new ArrayBlockingQueue<>(3);
		System.out.println("******************    offer(e), poll(), peek(): returns value    *****************");
		System.out.println("Peek when there are zero elements in the queue : "
				+ q2.peek());
		q2.offer(33);		
		q2.offer(43);
		q2.offer(37);
		System.out.println("**** added elements ****");
		for (Integer q : q2) {
			System.out.println(q);
		}

		System.out.println();
		System.out.println("Returns false if Queue reached limit : " + q2.offer(44));
		
		q2.remove();
		System.out.println("**** removed top element  ****");
		for (Integer q : q2) {
			System.out.println(q);
		}
		System.out.println("**** Top of Queue element ****");
		System.out.println(q2.peek());
	}
}
