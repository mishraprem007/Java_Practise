package string_Map_Java_March_26;

/*
 * Q.7 Find the Max, 2nd Max and min word in given string
 */
public class Q7 {
	public static void main(String[] args) {
		String str = "Selenium with Java Automation Testing is an easy tool";

		String[] words = str.split(" ");
		String max = "";
		String secondMax = "";
		String min = words[0]; // assume
		for (String word : words) {
			if (word.length() > max.length()) {
				secondMax = max;
				max = word;
			} else if (word.length() > secondMax.length() && word.length() != max.length()) {
				secondMax = word;
			}
			if (word.length() < min.length()) {
				min = word;
			}
		}
		System.out.println("max: " + max);
		System.out.println("secondMax: " + secondMax);
		System.out.println("min: " + min);

	}
}
