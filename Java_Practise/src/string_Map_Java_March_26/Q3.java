package string_Map_Java_March_26;

/**
 * Q3. Question: Reverse specific word at same place: I love my India.
 */
public class Q3 {

	public static void main(String[] args) {
		String str = "I love my India";
		String[] words = str.split(" ");
		String result = "";

		for (String word : words) {
			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			result = result + rev + " ";
		}
		System.out.println(result);
	}
}
