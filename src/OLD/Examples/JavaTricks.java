/* http://www.geeksforgeeks.org/few-tricky-programs-in-java/ */
package Examples;

public class JavaTricks {
	public static void main(String[] args) {
		// \u000d System.out.println("Hello");
		/*
		 * This will print
		 * "Hello , the unicode is parsed by Java as a new Line "
		 */
		
		loop1: for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				System.out.println("Hello");
				break loop1;
			}
		}
		/* Labeled for Loop, */
		/* 1) name the label */
		/* 2) break the label */
	}
}
