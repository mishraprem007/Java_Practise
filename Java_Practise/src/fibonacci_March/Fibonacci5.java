package fibonacci_March;

/**
 * Print Fibonacci in reverse using method
 */
public class Fibonacci5 {
	public static void fib(int n) {
		if (n <= 0) {
			return;
		}
		if (n == 1) {
			System.out.print(0);
			return;
		}
		int a = 0, b = 1, c = 0;
		for (int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		for (int i = n; i > 0; i--) {
			System.out.print(b + " ");
			c = b - a;
			b = a;
			a = c;
		}
	}

	public static void main(String[] args) {
		fib(5);
	}
}