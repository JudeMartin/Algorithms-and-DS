package Examples;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		System.out.println("Please Enter your Personal Details:");

		/* user input - Scanner and System.in */
		Scanner scn = new Scanner(System.in);

		/* name */
		System.out.println("Please enter your name:");
		String name = scn.nextLine();

		/* gender */
		System.out.println("Please enter your gender:");
		String gender = scn.nextLine();

		/* age */
		System.out.println("Please enter your age:");
		int age = scn.nextInt();

		/* print details */
		System.out
				.println("======================Your details are===============================>");
		System.out.println("Your name is: " + name);
		System.out.println("Your gender is: " + gender);
		System.out.println("Your age is: " + age);
		System.out.println("====================================================================>");
	}
}
