package codingBlocks.sortingAlgos;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 4, 6, 2, 8, 90, 1, 0, 1, 1, 1, 3 };
		System.out.println("Insertion Sort");
		sortInsertion(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void sortInsertion(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					swapArrayElements(arr, j, j - 1);
				} else {
					break;
				}
			}
		}
	}

	static void swapArrayElements(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
