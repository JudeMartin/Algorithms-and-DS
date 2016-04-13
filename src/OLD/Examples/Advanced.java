package OLD.Examples;

public class Advanced {
	// This course expects a working knowledge and understanding of the topics
	// covered in CSC 522. It covers classes and object orientation, collections
	// including arrays, array lists, and linked ists, event-driven programming
	// with graphical user interfaces, recursive methods, interfaces,
	// inheritance, iterators, and elementary searching and sorting.

	// array - store data
	// 1,2,3,4,5,6,7,8
	// int a = 1; - correct
	// int a = 1,2,3,4,5,6,7; - wrong
	// array = to store mutiple values
	// array : int, boolean, String
	// int[] someName = {1,2,4,5,6};
	// String[] someOtherName = {"Hello","World"};
	// boolean[] name = {true,false,false,true,false,false,true,true};

	public static void main(String[] args) {
		int[] numArray = { 1444, 61232, 73453, 45744, 2455, 7776 };// length =
																	// number of
																	// elements
																	// = 6 ?
		// 0,1,2,3,4,(arrayLength - 1) = (6 - 1) = 5 .
		System.out.println(numArray[0]);// first element = 0
		System.out.println(numArray[5]); // last element = arr.length - 1
		System.out.println(numArray[numArray.length - 2]);// second last element

		/* array is zero based */
		System.out.println("*********** print all the elements ***********");
		for (int i = 0; i <= 5; i++) {
			System.out.println(numArray[i]);// print each value on a new line
		}
		System.out
				.println("*********** print all the int elements ***********");
		int[] newArray = { 6, 7, 8, 5, 6, 8, 5 };
		for (int k = 0; k <= newArray.length - 1; k++) {
			System.out.print(newArray[k] + " ");// print on the same line
												// seperated by spaces;
		}
		System.out.println();
		System.out
				.println("*********** print all the String elements ***********");
		String[] strArray = { "Hello", "World", "from", "Jude", "Martin" };
		// 0 , 1 , 2, 3, 4, 5,6
		// searching in the array , if the element exists in the arry or not?
		// if it exits print yes else print no

		// search for element today , therefore print no

		for (int l = 0; l <= strArray.length - 1; l++) {
			System.out.println(strArray[l]);
			if (strArray[l] == "today") {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
