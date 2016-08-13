package DS.Math;

public class ReverseInteger {
	public int reverse(int x) {
		int inputNumber = x;
		int rem = 0;
		int result = 0;
		while (x != 0) {
			if (result * 10 / 10 != result)
				return 0;
			rem = x % 10;
			x = x / 10;
			result = result * 10 + rem;
		}
		return result;
	}

	public static void main(String[] args) {
		ReverseInteger rI = new ReverseInteger();
		System.out.println("Before Reversing: " + 123);
		int rev = rI.reverse(123);
		System.out.println("After Reversing: " + rev);
	}
}
