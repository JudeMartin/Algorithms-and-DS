/* https://leetcode.com/problems/word-pattern/ */
package Leetcode.Easy;

import java.util.HashMap;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		HashMap<Character, String> map = new HashMap<Character, String>();
		String[] str1 = str.split("\\s+");
		/* for debugging */
		for (String s : str1) {
			System.out.print(s);
		}

		System.out.println(str1.length);
		// pattern = "abba", str = "dog cat cat dog" ;
		/* length check */
		if (pattern.length() != str1.length)
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			/* check for key */
			if (!map.containsKey(pattern.charAt(i))) {
				/* check for the value */
				if (!map.containsValue(str1[i])) {
					map.put(pattern.charAt(i), str1[i]);
				} else {
					return false;
				}
			} else {
				if (!(map.get(pattern.charAt(i)).equals(str1[i]))) {
					return false;
				}
			}
		}
		return true;
	}
}
