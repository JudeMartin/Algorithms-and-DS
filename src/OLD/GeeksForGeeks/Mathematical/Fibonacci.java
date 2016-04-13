package OLD.GeeksForGeeks.Mathematical;
public class Fibonacci {
	/* O(n) = time , O(n) = space */
	/* dynamic programming */
	public void generateFibonaciSeries(int num) {
		if (num == 0) {
			System.out.println("0");
			return;
		}
		int[] fib = new int[num + 1];
		fib[0] = 0;
		fib[1] = 1;
		System.out.println("0" + "\n" + "1");
		for (int j = 2; j <= num; j++) {
			fib[j] = fib[j - 1] + fib[j - 2];
			System.out.println(fib[j]);
		}

	}

	/* O(n) = time , O(1) = space */
	/* Space optimized */
	public static void generateFib(int num) {
		if (num == 0) {
			System.out.println("0");
			return;
		}
		int a = 0, b = 1, c;
		System.out.println("0" + "\n" + "1");
		for (int i = 2; i <= num; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		int num = 10;
		fb.generateFibonaciSeries(num);
		generateFib(num);
	}
}
