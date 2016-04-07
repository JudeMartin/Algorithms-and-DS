package HackerRank.ThirtyDaysChallenge;

import java.util.Scanner;

public class Day25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int cases = scn.nextInt();
		while (cases-- > 0) {
			int n = scn.nextInt();
			System.out.println(isPrime(n) ? "Prime" : "Not prime");
		}
	}

	private static boolean isPrime(int prime) {
		if (prime <= 1)
			return false;
		else if (prime <= 3)
			return true;
		else if (prime % 2 == 0 || prime % 3 == 0)
			return false;
		else {
			for (long i = 5; i * i < prime; i += 6) {
				if (prime % i == 0 || prime % (i + 2) == 0)
					return false;
			}
		}
		return true;

	}
}
