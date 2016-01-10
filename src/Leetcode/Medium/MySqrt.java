/* https://leetcode.com/problems/sqrtx/ */
package Leetcode.Medium;

public class MySqrt {

	public int mySqrt(int x) {
		if (x == 0) {
			return 0;
		}
		double n = x;
		double y = 1;

		while (n - y > 0.00001) {
			n = (n + y) / 2;
			y = x / n;
		}
		return (int) n;
	}

	public static void main(String[] args) {
		MySqrt ms = new MySqrt();
		int x = 49;
		int res = ms.mySqrt(x);
		System.out
				.println("********** Babyloanian Method of Sqrt *************");
		System.out.println("Sqrt of " + x + "is " + res);
	}
}
