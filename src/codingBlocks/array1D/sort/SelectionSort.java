package codingBlocks.array1D.sort;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * In selection sort, we find the minimum item in each iteration and then swap
		 * arr[counter] with arr[min_index] -- counter will be same here as bubble sort,
		 * 0 to n-1 ------ inner loop will run from counter to n-1
		 */
		int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println("Array before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		selectionSort(arr);
		System.out.println("Array after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void selectionSort(int[] arr) {
		int counter = 0;
		while (counter < arr.length - 1) {
			int j = counter + 1;
			int min = counter;
			while (j < arr.length) {
				if (arr[j] < arr[min]) {
					// if current element is less than min element, then change min
					min = j;
				}
				j++;
			}
			// swap arr[counter] and arr[min]
			int temp = arr[min];
			arr[min] = arr[counter];
			arr[counter] = temp;

			counter++;
		}
	}

}
