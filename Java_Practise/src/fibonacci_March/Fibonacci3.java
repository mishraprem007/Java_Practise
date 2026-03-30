package fibonacci_March;

/**
 * Print Fibonacci up to a limit using method
 */
public class Fibonacci3 {
	public static void fib(int limit) {
		int a = 0, b = 1;
		while (a <= limit) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		fib(5);
	}
}