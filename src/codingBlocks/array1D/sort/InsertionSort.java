package codingBlocks.array1D.sort;

public class InsertionSort {

	public static void main(String[] args) {
		/*
		 * In insertion sort, the assumption is that array is already sorted till
		 * counter element, and we have to enter insert next number in previously sorted
		 * array in such manner that new array is also sorted
		 */
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10 };
		System.out.println("Array before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("Array after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void insertionSort(int[] arr) {
		// counter will start from 1 because 0th element is always sorted
		int counter = 1;
		while (counter < arr.length) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0) {
				if (arr[j] > val) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
				j--;
			}
			arr[j + 1] = val;
			counter++;
		}
	}

}
