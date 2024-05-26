package codingBlocks.array1D.sort;

public class HighestBound {

	public static void main(String[] args) {
		/*
		 * Given a sorted array which can have duplicates, you need to find the last
		 * occurrence of item in that array
		 */

		int[] arr = { 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 6, 6, 7 };
		System.out.println(findhighestBound(arr, 7));
		System.out.println(findhighestBound(arr, 2));

	}

	public static int findhighestBound(int[] arr, int item) {
//		We will use binary search, but with a slight change
		int lo = 0, hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] < item) {

				lo = mid + 1;
			} else if (arr[mid] > item) {

				hi = mid - 1;
			} else {

				if (mid < arr.length - 1 && arr[mid + 1] == arr[mid]) {
					lo = mid + 1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}
}
