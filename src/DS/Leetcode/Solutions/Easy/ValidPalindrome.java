/* https://leetcode.com/problems/valid-palindrome/ */
package DS.Leetcode.Solutions.Easy;

public class ValidPalindrome {
	public boolean isPalindrome(String str) {
		/* essentially the trim() method */
		/* exclude all letters lower case and upper case letter */
		/* if dosen't match the criteria delete all of them using replaceAll */
		String s = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		if (s.length() < 2) {
			return true;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			/* 2 pointers first and last */
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
