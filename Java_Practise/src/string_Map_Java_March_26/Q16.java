package string_Map_Java_March_26;

/**
 * Q16. if a given string is abcd output should be abbcccdddd
 */
public class Q16 {

	public static void main(String[] args) {
		String str = "abcd";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				result = result + str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
