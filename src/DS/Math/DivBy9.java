/* http://www.geeksforgeeks.org/divisibility-9-using-bitwise-operators/ */
package DS.Math;

public class DivBy9 {
	static boolean isDivBy9(int n) {
		// Base cases
		if (n == 0 || n == 9)
			return true;
		if (n < 9)
			return false;

		// If n is greater than 9, then recur for [floor(n/9) - n%8]
		int a = (n >> 3);
		int b = (n & 7);
		return isDivBy9((int) a - (int) b);
	}

	public static void main(String[] args) {
		System.out.println(isDivBy9(19));
	}
}
//19 / 2 = 1 ,9 / 2 = 1,4/2 = 0 ,2/2 = 0
//1100 = 