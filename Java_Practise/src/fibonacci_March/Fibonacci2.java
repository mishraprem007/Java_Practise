package fibonacci_March;

/**
 * Find nth Fibonacci number using method
 */
public class Fibonacci2 {

	public static int fib(int num) {

		int a = 0, b = 1;
		if (num == 0) {
			return a;
		}
		for (int i = 2; i <= num; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println(fib(8));
	}
}
