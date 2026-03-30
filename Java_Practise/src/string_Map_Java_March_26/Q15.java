package string_Map_Java_March_26;

/**
 * Q15. in given string i love my india Convert first letter of each word to
 * uppercase
 */
public class Q15 {

	public static void main(String[] args) {
		String str = "i love my india";
		String[] words = str.split(" ");
		String result = "";

		for (String word : words) {
			result = result + word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
		}
		System.out.println(result);
	}

}
