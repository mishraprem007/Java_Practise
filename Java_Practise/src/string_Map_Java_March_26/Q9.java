package string_Map_Java_March_26;

import java.util.HashMap;

/**
 * Q9. Reverse string using hashmap
 */
public class Q9 {
	public static void main(String[] args) {
		String str = "Anil";
		HashMap<Integer, Character> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(i, str.charAt(i));
		}
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(map.get(i));
		}
	}

}
