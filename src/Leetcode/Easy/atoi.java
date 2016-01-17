/* https://leetcode.com/problems/string-to-integer-atoi/ */
package Leetcode.Easy;

public class atoi {

	public int myAtoi(String str) {
		// null and empty string
		if (str.length() == 0 || str == null) {
			return 0;
		}
		char flag = '+';

		// remove white spaces
		str = str.trim();
		int i = 0;
		if (str.charAt(i) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		double result = 0;
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}

		if (flag == '-') {
			result = -result;
		}

		if (result < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		if (result > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		return (int) result;
	}
}
