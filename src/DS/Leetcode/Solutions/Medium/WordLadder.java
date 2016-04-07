package DS.Leetcode.Medium;
/* https://leetcode.com/problems/word-ladder/ */
import java.util.LinkedList;
import java.util.Set;

public class WordLadder {
	/*
	 * start = "hit" end = "cog" dict = ["hot","dot","dog","lot","log"]
	 */

	public int ladderLength(String beginWord, String endWord,
			Set<String> wordList) {
		if (wordList.size() == 0) {
			return 0;
		}
		wordList.add(endWord);
		/* 2 queues */
		LinkedList<String> wordQueue = new LinkedList<String>();
		LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
		/* add the intial values to the queues */
		wordQueue.offer(beginWord);
		distanceQueue.offer(1);
		int result = Integer.MAX_VALUE;
		while (!wordQueue.isEmpty()) {
			/* poll both the queues */
			String currString = wordQueue.poll();
			Integer currDistance = distanceQueue.poll();
			/* value check */
			if (currString.equals(endWord)) {
				result = Math.min(result, currDistance);
			}
			/* start the substitution process */
			for (int i = 0; i < currString.length(); i++) {
				/* each char from the string */
				char[] charAry = currString.toCharArray();
				for (char c = 'a'; c <= 'z'; c++) {
					charAry[i] = c;
					/* regenerate the char array to a string */
					String newString = new String(charAry);
					/* check from dict */
					if (wordList.contains(newString)) {
						/* remove from dict,increment the queues */
						wordList.remove(newString);
						distanceQueue.add(currDistance + 1);
						wordQueue.add(newString);
					}
				}
			}
		}
		if (result < Integer.MAX_VALUE) {
			return result;
		} else {
			return 0;
		}
	}
	/**
	 * Use two queue's one for word count and the other for distance count
	 **/
}
