package string_Map_Java_March_26;

import java.util.HashMap;

/**
 * Q12. find the duplicate string word from the given string word or string
 */
public class Q12_two {

	public static void main(String[] args) {
		String str = "java selenium java testing selenium";
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "";
				}
			}
			if (!words[i].equals("") && count > 1) {
				System.out.println(words[i] + " occurrence: " + count);
			}
		}
	}
}
