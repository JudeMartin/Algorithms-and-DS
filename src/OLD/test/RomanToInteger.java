package OLD.test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	static int romanToInteger(String s){
		int sum = 0;
		Map<Character,Integer> T = new HashMap<Character, Integer>(){
			{
				put('I',1);
			}
		};
		Map<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		return sum;
	}
	
	public static void main(String[] args) {
		assert(7 == romanToInteger("II"));
	}
}
