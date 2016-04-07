package HackerRank.ThirtyDaysChallenge;

import java.util.Scanner;

class Student {
	protected String firstName;
	protected String lastName;
	int phone;

	Student(String fname, String lname, int p) {
		firstName = fname;
		lastName = lname;
		phone = p;

	}

	public void display() {// display the details of the student
		System.out.println("First Name: " + firstName + "\nLast Name: "
				+ lastName + "\nPhone: " + phone);
	}

}

class Grade extends Student {
	private int score;

	Grade(String fname, String lname, int p, int s) {
		super(fname, lname, p);
		score = s;
	}

	public char calculate() {
		char res = ' ';
		if (score < 40) {
			res = 'D';
		} else if (score >= 40 && score < 60) {
			res = 'B';
		} else if (score >= 60 && score < 75) {
			res = 'A';
		} else if (score >= 75 && score < 90) {
			res = 'E';
		} else {
			res = 'O';
		}
		return res;
	}
}

public class Day11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();
		String lastName = sc.nextLine();
		int phone = sc.nextInt();
		int score = sc.nextInt();
		Student stu = new Grade(firstName, lastName, phone, score);
		stu.display();
		Grade g = (Grade) stu;
		System.out.println("Grade: " + g.calculate());

	}
}