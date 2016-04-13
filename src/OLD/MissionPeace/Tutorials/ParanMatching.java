package OLD.MissionPeace.Tutorials;

import java.util.Deque;
import java.util.LinkedList;

public class ParanMatching {
	public boolean isValid(char[] arr) {
		Deque<Character> stack = new LinkedList<>();
		for (char a : arr) {
			if (a == '(' || a == '[' || a == '{') {
				stack.offer(a);
			} else {
				if (!stack.isEmpty()) {
					char ch = stack.poll();
					if ((a == ')' && ch != '(') || (a == '}' && ch != '{')
							|| (a == ']' && ch != '[')) {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		char[] arr = { '(', '{', '[', ']', '}', ')' };
		ParanMatching p = new ParanMatching();
		System.out.println(" Does the given array consist matching paranthesis ? "
			   + p.isValid(arr));
	}
}
