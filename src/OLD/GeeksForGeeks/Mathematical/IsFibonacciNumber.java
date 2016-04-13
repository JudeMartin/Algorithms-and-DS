package OLD.GeeksForGeeks.Mathematical;

public class IsFibonacciNumber {
	public static void main(String[] args) {
		int num = 9;
		System.out.println(checkIfFibonacciNumber(num) ? num+ " is a Fibonacci number" : num+" is not a Fibonacci number");
	}

	static boolean checkIfFibonacciNumber(int n) {

		return isPerfectSquare(5 * n * n - 4) || isPerfectSquare(5 * n * n + 4);
	}

	static boolean isPerfectSquare(int num) {
		// TODO Auto-generated method stub
		int temp = (int) Math.sqrt(num);
		if (temp * temp == num) {
			return true;
		}
		return false;
	}

}
