package codingBlocks.array1D.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] arr = { 1, 2, 32, 12, 11, 10, 29 };
		System.out.println(linearSearch(arr, 29));

	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}

		return -1;
	}

}
