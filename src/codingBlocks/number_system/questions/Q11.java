package codingBlocks.number_system.questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {

	/*
	 * Take N (number of rows), print the following pattern (for N = 6) 1 1 1 1 2 1
	 * 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1 Input Format
	 * 
	 * Constraints
	 * 
	 * 0 < N < 100 Output Format
	 * 
	 * Sample Input
	 * 
	 * 6
	 * 
	 * Sample Output
	 * 
	 * 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1
	 * 
	 */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter n");
		int n = scn.nextInt();

		int row = 0, col = 0, nst = 1;
		ArrayList<Integer> lastRow = new ArrayList<Integer>();
		lastRow.add(1);
		lastRow.add(1);
		while (row < n) {

			col = 1;
// current row
			int[] arr = new int[row + 1];
			
			if (row == 0) {
				arr[0] = 1;
			} else {
				arr[0] = 1;
				arr[arr.length - 1] = 1;
			}
			if (row > 1) {
				for (int i = 1; i < lastRow.size(); i++) {

					arr[i] = lastRow.get(i) + lastRow.get(i - 1);

				}
				lastRow = new ArrayList<Integer>();

				for (int a : arr) {
					lastRow.add(a);

				}

			}

			for (int i = 0; i < lastRow.size(); i++) {
				if (row == 0 && i == 1) {
					continue;
				} else {
					System.out.print(lastRow.get(i) + " ");
				}

			}
			System.out.println();
			nst++;
			row++;

		}

	}

}
