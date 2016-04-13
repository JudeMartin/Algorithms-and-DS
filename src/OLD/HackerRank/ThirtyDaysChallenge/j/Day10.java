package OLD.HackerRank.ThirtyDaysChallenge.j;
import java.util.Scanner;

public class Day10 {
	public static String generateBinary(int n) {
		if (n == 0) {
			return "0";
		}
		String binary = "";
		while (n > 0) {
			int rem = n % 2;
			binary = binary + rem;
			n = n / 2;
		}
		return new StringBuffer(binary).reverse().toString();
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int totalNumberofCases = scn.nextInt();
		while (totalNumberofCases > 0) {
			String res = generateBinary(scn.nextInt());
			System.out.println(res);
			totalNumberofCases--;
		}
	}
}