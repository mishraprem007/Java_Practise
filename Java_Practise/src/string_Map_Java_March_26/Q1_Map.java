package string_Map_Java_March_26;

import java.util.HashMap;
import java.util.Map;

/**
 * Q1. Find the occurrence of char in given String
 */
public class Q1_Map {

	public static void main(String[] args) {
		String str = "JaiShreeGaneshjee".toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
	}

}
