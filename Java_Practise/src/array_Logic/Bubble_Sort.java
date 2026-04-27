package array_Logic;

/**
 * Implementation of Bubble Sort in Java
 */
public class Bubble_Sort {
	static void print(int a[]) 
	// function to print array elements
	{
		int n = a.length;
		int i;
		for (i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void bubbleSort(int a[]) 
	// function to implement bubble sort
	{
		int n = a.length;
		int i, j, temp;
		boolean isSwapped = false;
		for (i = 0; i < n; i++) {
			isSwapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					isSwapped = true;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (!isSwapped) {
				// No swapping is done. Hence, break the loop
				break;
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 15, 16, 11, 13, 14 };
		Bubble_Sort b1 = new Bubble_Sort();
		System.out.println("Before sorting the array, the elements are: ");
		b1.print(a);
		b1.bubbleSort(a);
		System.out.println();
		System.out.println("After sorting array elements are: ");
		b1.print(a);
	}
}
