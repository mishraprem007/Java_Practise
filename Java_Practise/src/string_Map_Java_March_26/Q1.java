package string_Map_Java_March_26;

/**
 * Q1. Find the occurrence of char in given String
 */
public class Q1 {

	public static void main(String[] args) {
		String str = "JaiShreeGaneshjee".toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (str.indexOf(str.charAt(i)) == i) {
				System.out.println(str.charAt(i) + " occurance: " + count);
			}
		}

	}

}
