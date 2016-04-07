package Examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class looping {

	// This course has no programming prerequisite and covers introductory Java
	// programming. Students learn about sequential execution, data types,
	// number systems, variables, conditionals, loops, methods, random number
	// generation, console input/output, and file input/output.

	public static void main(String[] args) throws IOException {

		/* for loop - print name 10 times */
		/* print from 0 to 9 = 10 times */
		for (int i = 0; i < 10; i++) {
			System.out.println("My name is Jude Martin");
		}

		/* random number */
		/* create a new object */

		System.out.println("======Generation of Random number =======>");
		Random rnd = new Random(); // create a random object
		int randonNumber = rnd.nextInt(); // nextInt() on random number gives a
											// random number
		System.out.println("Random number generated is: " + randonNumber);

		/* File input */
		// FIS
		FileReader in = new FileReader(
				"/Users/jude/git/Algorithms-and-DS/src/test/hello.txt");
		int data = in.read();
		System.out
				.println("==========The contents of the file are:=========> ");
		while (data != -1) {
			System.out.print((char) data);
			data = in.read();
		}

	}
}
