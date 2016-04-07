/* https://leetcode.com/problems/power-of-three/ */
package DS.Leetcode.Solutions.Easy;

public class IsPow {
	public static boolean isPowerOfThree(int n) {
		if (n > 1) {
			while (n % 3 == 0) {
				n /= 3;
			}
		}
		return n == 1;
	}

	public static void main(String[] args) {
		int num = 81;
		System.out.println(isPowerOfThree(81) ? "Yes " + num + " is a power of 3"
				: "No " + num + " is not a power of 3");
	}
}
