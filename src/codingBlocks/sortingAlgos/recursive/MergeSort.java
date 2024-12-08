package codingBlocks.sortingAlgos.recursive;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 10, 2, 3, 4, 6, 2, 8, 90, 1, 0, 1, 1, 1, 3 };
		mergeSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	static void mergeSort(int[] arr, int i, int j) {
		if (i < j) {
			System.out.println("inside mergeSort");
			int mid = i + (j - i) / 2;

			mergeSort(arr, i, mid);
			mergeSort(arr, mid + 1, j);
			merge(arr, i, mid, j);
		}

	}

	static void merge(int[] arr, int i, int mid, int j) {
		System.out.println("inside merge, i=" + i + " mid=" + mid + " j=" + j);
		int L1 = mid - i + 1;
		int L2 = j - (mid + 1) + 1;
		int[] leftArray = new int[L1];
		int[] rightArray = new int[L2];
		for (int x = 0; x < L1; x++) {
			leftArray[x] = arr[i + x];
		}
		for (int y = 0; y < L2; y++) {
			rightArray[y] = arr[mid + 1 + y];
		}
		int x = 0, y = 0;
		int k = i;
		while (x < L1 && y < L2) {
			if (leftArray[x] <= rightArray[y]) {
				arr[k] = leftArray[x];
				x++;

			} else {
				arr[k] = rightArray[y];
				y++;
			}

			k++;

		}
		while (x < L1) {
			arr[k] = leftArray[x];
			x++;
		}
		while (y < L2) {
			arr[k] = rightArray[y];
			y++;
		}
	}

}
