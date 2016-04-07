/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-18-queues-stacks */
package HackerRank.ThirtyDaysChallenge;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18 {
	class Palindrome {
		// Write your code here
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();

		// push -> stack and queue
		void pushCharacter(char ch) {
			stack.push(ch);
		}

		void enqueueCharacter(char ch) {
			queue.offer(ch);
		}

		// pop -> stack and queue
		char popCharacter() {
			return stack.pop();
		}

		char dequeueCharacter() {
			return queue.poll();
		}
	}
}
