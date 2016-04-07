/*http://www.geeksforgeeks.org/how-to-swap-two-variables-in-one-line/ */
package GeeksForGeeks.Random;

public class SwapOneLine {
	public static void swapOneLine(int a, int b) {
		/* One line swap using xor */
		a = a ^ b ^ (b = a);
		System.out.println("after swaping a: " + a);
		System.out.println("after swaping b: " + b);
	}

	public static void main(String[] args) {
		int a = 3, b = 4;
		System.out.println("Before swaping a: " + a);
		System.out.println("Before swaping b: " + b);
		swapOneLine(a, b);
	}
}
