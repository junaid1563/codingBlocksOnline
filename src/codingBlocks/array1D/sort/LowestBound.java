package codingBlocks.array1D.sort;

public class LowestBound {

	public static void main(String[] args) {
		/*
		 * Given a sorted array which can have duplicates, you need to find the first
		 * occurrence of item in that array
		 */

		int[] arr = { 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5, 6, 6, 6, 7 };
		System.out.println(findlowestBound(arr, 3));

	}

	public static int findlowestBound(int[] arr, int item) {
//		We will use binary search, but with a slight change
		int lo = 0, hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] < item) {

				lo = mid + 1;
			} else if (arr[mid] > item) {

				hi = mid - 1;
			} else {

				if (arr[mid - 1] == arr[mid]) {
					hi = mid - 1;
				} else {
					return mid;
				}
			}
		}
		return -1;
	}

}
