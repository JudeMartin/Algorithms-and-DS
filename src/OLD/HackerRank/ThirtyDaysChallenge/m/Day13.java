package OLD.HackerRank.ThirtyDaysChallenge.m;

abstract class Book {
	String title;
	String author;

	Book(String t, String a) {
		title = t;
		author = a;
	}

	abstract void display();

}

public class Day13 {
	class MyBook extends Book {
		
		int price;

		MyBook(String title, String author, int price) {
			super(title, author);
			this.price = price;
		}

		public void display() {
			System.out.println("Title: " + title);
			System.out.println("Author: " + author);
			System.out.println("Price: " + price);
		}
	}
}
