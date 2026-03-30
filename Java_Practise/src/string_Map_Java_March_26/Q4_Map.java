package string_Map_Java_March_26;

import java.util.Collection;
import java.util.HashMap;

/**
 * Q4. Duplicate characters in a given string.
 */
public class Q4_Map {
	public static void main(String[] args) {
		String str = "programmming";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (char key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " occurrence " + map.get(key));
			}
		}
	}
}
