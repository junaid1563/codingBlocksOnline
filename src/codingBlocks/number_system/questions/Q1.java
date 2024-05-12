package codingBlocks.number_system.questions;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int row = 0, col = 0, nst1 = 1, nsp2 = -1, nst2 = 1, nsp1 = n-1;
		while (row < n) {

			col = 0;
			while (col < nsp1) {
				System.out.print("  ");
				col++;
			}
			col = 0;

			while (col < nst1) {
				int star = 0;
				if (row < n / 2) {
					star = row + 1 - col;
				} else {
					star = n - row - col;
				}

				System.out.print(star+" ");
				col++;
			}
			col = 0;
			while (col < nsp2) {
				System.out.print("  ");
				col++;
			}
			col = 0;

			while (col < nst2) {
				if (row == 0 || row == n - 1) {
					break;
				}
				int star = 0;

				star = col + 1;

				System.out.print(star+" ");
				col++;
			}

			if (row < n / 2) {
				nsp1 -= 2;
				nst1++;
				nsp2 += 2;
				nst2++;
			} else {
				nsp1 += 2;
				nst1--;
				nsp2 -= 2;
				nst2--;
			}
			System.out.println();
			row++;

		}

	}

}
