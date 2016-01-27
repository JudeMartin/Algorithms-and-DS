package Java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Examples {
	/* Examples of Java8 Stream Api's */
	/* merge large amount of data */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		//Stream<String> stream = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer.txt"));
		Stream<String> stream1 = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer_01.txt")); /* files as lines */
		Stream<String> stream2 = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer_02.txt"));
		Stream<String> stream3 = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer_03.txt"));
//      System.out.println(stream1.count());  /* line count */
//		System.out.println(stream2.count());
//		System.out.println(stream3.count());
		
		/* Stream of Streams containing Strings */
		/* adding add the streams as list of Streams */
		Stream<Stream<String>> streamOfStreams = Stream.of(stream1,stream2,stream3); /* passing multiple streams */
		/* Stream of lines */
		//Stream<String> streamOfLines =  streamOfStreams.flatMap(stream -> stream); /* similar to the below one */
		Stream<String> streamOfLines =  streamOfStreams.flatMap(Function.identity()); /* after combining the streams , the total lines */
		//System.out.println("Number of Lines: "+streamOfLines.count());
		
		
		/* Function interface returning a String and taking a Stream<String> -> preform regex on it */
		Function<String,Stream<String>> lineSplitter = line -> Pattern.compile(" ")
																	  .splitAsStream(line);

	Stream<String> streamOfWords = 
			streamOfLines.flatMap(lineSplitter)
			.map(word -> word.toLowerCase())
			.distinct();
	System.out.println("Display the number of words: "+streamOfWords.count());
	}
}
