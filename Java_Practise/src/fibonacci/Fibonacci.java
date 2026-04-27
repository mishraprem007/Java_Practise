package fibonacci;

/**
 * Write a Java program using a method to print Fibonacci series up to N
 * numbers.
 */
public class Fibonacci {
	public static void printFibonacci(int num) {
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");

		for (int i = 2; i < num; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
	public static void main(String[] args) {
		printFibonacci(8);
	}
}