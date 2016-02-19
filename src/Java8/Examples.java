package Java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Examples {
	/* Examples of Java8 Stream Api's */
	/* merge large amount of data */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
//		
//		//Stream<String> stream = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer.txt"));
//		Stream<String> stream1 = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer_01.txt")); /* files as lines */
//		Stream<String> stream2 = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer_02.txt"));
//		Stream<String> stream3 = Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/TomSwayer_03.txt"));
////      System.out.println(stream1.count());  /* line count */
////		System.out.println(stream2.count());
////		System.out.println(stream3.count());
//		
//		/* Stream of Streams containing Strings */
//		/* adding add the streams as list of Streams */
//		Stream<Stream<String>> streamOfStreams = Stream.of(stream1,stream2,stream3); /* passing multiple streams */
//		/* Stream of lines */
//		//Stream<String> streamOfLines =  streamOfStreams.flatMap(stream -> stream); /* similar to the below one */
//		Stream<String> streamOfLines =  streamOfStreams.flatMap(Function.identity()); /* after combining the streams , the total lines */
//		//System.out.println("Number of Lines: "+streamOfLines.count());
//		 
//		
//		/* Function interface returning a String and taking a Stream<String> -> perform regex on it */
//		Function<String,Stream<String>> lineSplitter = line -> Pattern.compile(" ")
//																	  .splitAsStream(line);
//
//	Stream<String> streamOfWords = 
//			streamOfLines.flatMap(lineSplitter)
//						 .map(word -> word.toLowerCase())
//						 .distinct();
//	System.out.println("Display the number of words: "+streamOfWords.count());
//	
//	Stream<Long> boxedStream = LongStream.of(1L,2L,3L).boxed(); /* boxing and unboxing =  auto boxing */
//	
//	Set<String> shakespeareWords = 
//			Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/Shakespeare.txt"))
//			     .map(word -> word.toLowerCase())
//			     .collect(Collectors.toSet()); /* getting the values as a set from the .txt file hence no duplicates */
//	
//	Set<String> scrabbleWordsJava8 = 
//			Files.lines(Paths.get("/Users/jude/git/Algorithms-and-DS/src/Java8/Scrabble.txt"))
//				 .map(word -> word)
//				 .collect(Collectors.toSet());
//	
//	Set<String> scrabbleWordsJava7 = new HashSet<String>();
//		BufferedReader in = new BufferedReader(new FileReader("example.tab"));
//		String line = "";
//	
//	while((line = in.readLine())!=null){
//		scrabbleWordsJava7.add(line);
//	}
//	
	
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"1Jude");
	map.put(2,"2Jude");
	map.put(3,"3Jude");
	map.put(4,"4Jude");
	map.put(5,"5Jude");
	
	
	for (int i : map.keySet()) {
		System.out.println(map.get(i));
	}
		
	//System.out.println("number of words in the shakespeare set: " + shakespeareWordsJava8.size());
	//System.out.println("number of words in the scrabble set: " + scrabbleWords.size());
	}
}
/*
 * stream.of and flatMap patterns - works well on 10000 of lines - very efficient and powerful pattern
 * efficiently split streams using the flatMap Pattern
 * */

/* Stream of number are there to avoid the cost of boxing and unboxing.
 * 
 * 
 * */ 
 