package CaveOfProgramming.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ETutorialSet {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		System.out.println("**********   Hash Set Implementation    ***********");
		testSet(hashSet);
		System.out.println("**********   Linked Hash Set Implementation    ***********");
		testSet(linkedHashSet);
		System.out.println("**********   Tree Set Implementation    ***********");
		testSet(treeSet);
		
		System.out.println("**********   Set Intersection Implementation <removeAll,retainAll>   ***********");
		testSetIntersection(hashSet, hashSet);
	}
	public static void testSet(Set<String> set){
		set.add("Cat");
		set.add("Apple");
		set.add("Zebra");
		set.add("Dog");
		set.add("Google");
		set.add("Tesla");
		System.out.println(set);		
	}
	public static void testSetIntersection(Set<String> set1,Set<String> set2){
		set1.add("Cat");
		set1.add("Apple");
		set1.add("Zebra");
		set1.add("Dog");
		set1.add("Google");
		set1.add("Tesla");
		
		set2.add("Casio");
		set2.add("Instagram");
		set2.add("Facebook");
		set2.add("Dog");
		set2.add("Google");
		set2.add("Tesla");
		
		/* create a new HashSet for intersection */
		Set<String> intersection = new HashSet<String>(set1);
		
		/* Difference */
		intersection.removeAll(set2);
		System.out.println("Intersection -> Remove All" + intersection);
		
		/* Common Elements */
		intersection.retainAll(set2);
		System.out.println("Intersection -> Retain All" + intersection);
		
	}
}
