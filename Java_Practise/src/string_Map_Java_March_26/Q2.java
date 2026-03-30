package string_Map_Java_March_26;

/**
 * Q2. Reverse String
 */
public class Q2 {

	public static void main(String[] args) {
		String str = "abcdef";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
