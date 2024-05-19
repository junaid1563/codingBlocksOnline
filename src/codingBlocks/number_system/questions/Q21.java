package codingBlocks.number_system.questions;

import java.util.Scanner;

//
//Take N (number of rows), print the following pattern (for N = 5).
//
//     * * * * *
//     * *   * *
//     *       *
//     * *   * *
//     * * * * *
//

public class Q21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n - n / 2, nsp = -1, row = 0, col = 0;
		while (row < n) {
			col = 0;
			while (col < nst) {
				System.out.print("* ");
				col++;
			}
			col = 0;
			while (col < nsp) {
				System.out.print("  ");
				col++;
			}
			col = 0;
			if (row == 0 || row == n - 1) {
				col = 1;
			}
			while (col < nst) {
				System.out.print("* ");
				col++;
			}
			System.out.println();
			if (row < n / 2) {
				nst--;
				nsp += 2;
			} else {
				nst++;
				nsp -= 2;
			}

			row++;
		}
	}

}
