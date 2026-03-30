package string_Map_Java_March_26;

/**
 * Q4. Duplicate characters in a given string.
 */
public class Q4 {
	public static void main(String[] args) {
		String str = "programmming";

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			char ch = str.charAt(i);
			for (int j = i + 1; j < str.length(); j++) {
				if (ch == str.charAt(j)) {
					count++;
				}
			}
			if (count > 1 && str.indexOf(str.charAt(i)) == i) {
				System.out.println(ch + " occurrence: " + count);
			}
		}
	}
}
