package Leetcode.Easy;

public class IsPow {
	public static boolean isPowerOfThree(int n) {
		if (n > 1)
			while (n % 3 == 0)
				n /= 3;
		return n == 1;
	}
	public static void main(String[] args) {
		boolean res = isPowerOfThree(81);
		System.out.println(res);
	}
}
