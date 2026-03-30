package string_Map_Java_March_26;

import java.util.HashMap;

/**
 * Q12. find the duplicate string word from the given string word or string
 */
public class Q12 {

	public static void main(String[] args) {
		String str = "java selenium java testing selenium";
		String[] words = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else {
				map.put(word, 1);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " occurence: " + map.get(key));
			}
		}
	}
}
