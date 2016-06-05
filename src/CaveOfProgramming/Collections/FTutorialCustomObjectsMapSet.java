package CaveOfProgramming.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;

	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return " { " + " ID: " + id + " name: " + name + " } ";

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class FTutorialCustomObjectsMapSet {

	public static void main(String[] args) {

		PreDefinedObjects();

		Person p1 = new Person(0, "Dad");
		Person p2 = new Person(1, "Mom");
		Person p3 = new Person(2, "Bro1");
		Person p4 = new Person(3, "Bro2");
		Person p5 = new Person(4, "JAM");
		Person p6 = new Person(4, "JAM"); /* duplicate Key for the Map */
		/*
		 * use HashCode and equals in the Person class to eliminate duplicate
		 * Keys in Map and values in Set for custom objects and opposed to internal
		 * handling of duplicates in predefined objects
		 */
		Map<Person, Integer> map = new HashMap<>();
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 4);
		map.put(p5, 5);
		map.put(p6, 6);

		Set<Person> set = new HashSet<>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p6);
		System.out
				.println("***********   Printing Map Elements    *************");
		for (Map.Entry<Person, Integer> entry : map.entrySet()) {
			System.out.println("Key -> " + entry.getKey() + ", Value -> "
					+ entry.getValue());
		}
		System.out.println("************ Printing Set Elements   ************");
		System.out.println(set);

	}

	private static void PreDefinedObjects() {
		Map<String, Integer> map = new HashMap<>();
		map.put("Five", 5);
		map.put("one", 1);
		map.put("Four", 4);
		map.put("three", 3);
		map.put("two", 2);
		map.put("Five", 5); /* duplicate Keys will not be added to the Map */

		Set<String> set = new HashSet<>();
		set.add("four");
		set.add("three");
		set.add("one");
		set.add("five");
		set.add("one"); /* duplicates will not be added to the Set */
		set.add("two");

		System.out
				.println("***********   Printing Map Elements    *************");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key -> " + entry.getKey() + ", Value -> "
					+ entry.getValue());
		}
		System.out.println("************ Printing Set Elements   ************");
		System.out.println(set);

	}

}
