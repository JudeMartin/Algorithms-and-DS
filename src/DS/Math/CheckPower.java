package DS.Math;

public class CheckPower {
	// Make changes as per the number to be checked with
	public static boolean isPowerOfThree(int num) {
		while (num > 0) {
			if (num == 1) {
				return true;
			}
			if (num % 3 != 0) {
				return false;
			} else {
				num /= 3;
			}
		}
		return false;
	}

	public static boolean isPowerOfTwo(int n) {
		return (n > 0 && (n & (n - 1)) == 0);
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(9));
		System.out.println(isPowerOfTwo(4));
	}
}
