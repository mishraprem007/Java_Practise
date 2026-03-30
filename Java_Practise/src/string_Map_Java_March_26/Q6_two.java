package string_Map_Java_March_26;

/**
 * Q6. Count alphabets, digits, spaces, and special characters in a string
 */
public class Q6_two {
	public static void main(String[] args) {

		String str = "Hello 123 @#";

		String alphabets = "";
		String digits = "";
		String spaces = "";
		String specialCharacter = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				alphabets = alphabets + ch;
			} else if (Character.isDigit(ch)) {
				digits = digits + ch;
			} else if (Character.isWhitespace(ch)) {
				spaces = spaces + ch;
			} else {
				specialCharacter = specialCharacter + ch;
			}
		}
		System.out.println("alphabets: " + alphabets + " count " + alphabets.length());
		System.out.println("digits " + digits + " count " + digits.length());
		System.out.println("spaces " + spaces + " count " + spaces.length());
		System.out.println("specialCharacter " + specialCharacter + " count " + specialCharacter.length());
	}
}
