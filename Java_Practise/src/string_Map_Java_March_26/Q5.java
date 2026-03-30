package string_Map_Java_March_26;

import java.util.Arrays;

/**
 * Q5. Check whether two given strings are anagrams or not.
 */
public class Q5 {
	public static void main(String[] args) {
		String str1 = "listen1";
		String str2 = "silent";

		if (str1.length() != str2.length()) {
			System.out.println("not anagrams");
			return;
		}

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);
		if (Arrays.equals(c1, c2)) {
			System.out.println("anagrams");
		} else {
			System.out.println("not anagrams");
		}
	}
}