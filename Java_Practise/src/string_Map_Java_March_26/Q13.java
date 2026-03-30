package string_Map_Java_March_26;

/**
 * Q13. show string is immutable
 */
public class Q13 {

	public static void main(String[] args) {
		String str = "Hello";
		str.concat(", how are you?");

		StringBuilder sb = new StringBuilder("Hello");
		sb.append(", how are you");
		System.out.println("str: " + str);
		System.out.println("sb: " + sb);
	}

}
