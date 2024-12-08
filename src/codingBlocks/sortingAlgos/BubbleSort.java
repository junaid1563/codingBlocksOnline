package codingBlocks.sortingAlgos;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 4, 6, 2, 8, 90, 1, 0, 1, 1, 1, 3 };
		System.out.println("Bubble Sort");
		sortBubble(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void sortBubble(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swapArrayElements(arr, j, j + 1);
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
