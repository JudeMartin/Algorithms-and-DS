package HackerRank.ThirtyDaysChallenge;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Day20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		StringTokenizer st = new StringTokenizer(sentence, "[!,?.\\_'@ ]+");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
