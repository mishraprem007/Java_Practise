package string_Map_Java_March_26;

/**
 * Q6. Count alphabets, digits, spaces, and special characters in a string
 */
public class Q6 {
	public static void main(String[] args) {
		String str = "Hello 123 @#";
		int alphabets = 0;
		int digits = 0;
		int spaces = 0;
		int specialCharacters = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				alphabets++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else if (Character.isWhitespace(ch)) {
				spaces++;
			} else {
				specialCharacters++;
			}
		}
		System.out.println("alphabets: " + alphabets);
		System.out.println("digits: " + digits);
		System.out.println("spaces: " + spaces);
		System.out.println("specialCharacters: " + specialCharacters);
	}
}
