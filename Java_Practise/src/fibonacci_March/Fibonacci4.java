package fibonacci_March;

/**
 * Print Fibonacci in reverse using method
 */
public class Fibonacci4 {
	public static void fib(int n) {
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		fib(5);
	}
}