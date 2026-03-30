package string_Map_Java_March_26;

/**
 * Q10. convert input string 1234 to output onetwothreefour
 */
public class Q10 {

	public static void main(String[] args) {

		String str = "1234";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			switch (ch) {
			case '1':
				System.out.print("one");
				break;
			case '2':
				System.out.print("two");
				break;
			case '3':
				System.out.print("three");
				break;
			case '4':
				System.out.print("four");
				break;
			}

		}
	}
}
