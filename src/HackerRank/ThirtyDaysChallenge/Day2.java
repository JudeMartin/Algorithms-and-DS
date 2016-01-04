package HackerRank.ThirtyDaysChallenge;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double M = sc.nextDouble(); // original meal price
		int T = sc.nextInt(); // tip percentage
		int X = sc.nextInt(); // tax percentage

		double tip = (T * M) / 100;
		double tax = (X * M) / 100;
		double finalPrice = M + tip + tax;

		int total = (int) Math.round(finalPrice);
		System.out.println("The final price of the meal is $" + total + ".");
		// ...then print!

	}
}
