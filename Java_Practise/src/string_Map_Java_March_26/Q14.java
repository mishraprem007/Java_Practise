package string_Map_Java_March_26;

/**
 * Q14. Reverse only letters skip special char
 */
public class Q14 {
	public static void main(String[] args) {
		String str = "a$b#c";
		String rev = "";
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				rev = rev + ch;
			}
		}
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				result = result + rev.charAt(j);
				j++;
			} else {
				result = result + str.charAt(i);
			}
		}
		System.out.println("str: " + str);
		System.out.println("result: " + result);
	}

}
