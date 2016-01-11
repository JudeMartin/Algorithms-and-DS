package GeeksForGeeks.Mathematical;

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

	/* O(logN) = time, O(1) = space */
	public void generateFib(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		int num = 0;
		fb.generateFibonaciSeries(num);
	}
}
