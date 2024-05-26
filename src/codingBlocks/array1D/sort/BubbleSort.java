package codingBlocks.array1D.sort;

public class BubbleSort {

	public static void main(String[] args) {
		/*
		 * Sort n-1 elements, then last element will be already sorted. Time complexity
		 * = O(n*n)
		 */

		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("Array before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void bubbleSort(int[] arr) {
		// we are sorting in ascending order
		int counter = 0;
		while (counter < arr.length - 1) {
			int j = 0;
			while (j < arr.length - 1 - counter) {
				// in each iteration verify if j element is grater than j+1 element, then swap
				// them other wise keep moving
				if (arr[j] > arr[j + 1]) {
					// swap j and j+1 element
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				j++;
			}
			counter++;
		}
	}

}
