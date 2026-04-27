package array_Logic;

/**
 * Java Program to sort the elements of an array in ascending order
 */
public class SortAscOrderWithoutTemp {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 8, 7, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
