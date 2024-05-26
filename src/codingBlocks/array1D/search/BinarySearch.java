package codingBlocks.array1D.search;

public class BinarySearch {

	public static void main(String[] args) {
//		Array should be sorted here

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		System.out.println(binarySearch(arr, 1));
	}

	public static int binarySearch(int[] arr, int item) {
		int lo = 0, hi = arr.length - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] < item) {
				lo = mid + 1;
			} else if (item < arr[mid]) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
