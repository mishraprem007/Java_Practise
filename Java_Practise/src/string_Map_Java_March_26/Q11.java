package string_Map_Java_March_26;
/**
 * Q11. count the vowel from given string
 * 
 */
public class Q11 {
	public static void main(String[] args) {
		String str = "programming";
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (ch == 'A' || ch == 'a') {
				a++;
			} else if (ch == 'E' || ch == 'e') {
				e++;
			} else if (ch == 'I' || ch == 'i') {
				i++;
			} else if (ch == 'O' || ch == 'o') {
				o++;
			} else if (ch == 'U' || ch == 'u') {
				u++;
			}
		}
		System.out.println("a: " + a);
		System.out.println("e: " + e);
		System.out.println("i: " + i);
		System.out.println("o: " + o);
		System.out.println("u: " + u);
	}
}
