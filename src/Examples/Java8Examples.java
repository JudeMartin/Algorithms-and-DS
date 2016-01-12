package Examples;

import java.util.ArrayList;
import java.util.List;

public class Java8Examples {
	/* using the streams API from Java - 8 */
	public static void printUsingJava8(List<String> names) {
		System.out.println("*********** Printing using Java - 8 , Streams Api ********");
		names.forEach(name -> System.out.print(name+" "));
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Jude");
		names.add("Anish");
		names.add("Aubrey");
		names.add("Rahul");
		names.add("Racheal");
		names.add("Adam");
		names.add("Chase");
		names.add("Chuka");
		names.add("Chumma");
		names.add("");
		printUsingJava8(names);
	}
}
