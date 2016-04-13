/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-3-if-statements*/
package OLD.HackerRank.ThirtyDaysChallenge.c;
import java.util.Scanner;

public class dDay3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n % 2 == 1)
			ans = "Weird";

		if (n % 2 == 0 && (n >= 2 && n <= 5)) {
			ans = "Not Weird";
		}

		if (n % 2 == 0 && (n >= 6 && n <= 20)) {
			ans = "Weird";
		}

		if (n % 2 == 0 && n > 20) {
			ans = "Not Weird";
		}

		System.out.println(ans);

	}
}
