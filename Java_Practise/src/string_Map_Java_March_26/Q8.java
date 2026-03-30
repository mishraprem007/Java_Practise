package string_Map_Java_March_26;

/**
 * Q8. Remove Duplicate Characters
 */
public class Q8 {

	public static void main(String[] args) {
		String str = "programming";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (result.indexOf(ch) == -1) {
				result = result + ch;
			}
		}
		System.out.println(result);
	}

}
