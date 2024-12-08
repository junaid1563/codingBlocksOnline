package codingBlocks.sortingAlgos;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 4, 6, 2, 8, 90, 1, 0, 1, 1, 1, 3 };
		System.out.println("Selection Sort");
		sortSelection(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void sortSelection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			swapArrayElements(arr, i, min_index);
		}
	}

	static void swapArrayElements(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
