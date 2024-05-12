package codingBlocks.number_system.questions;

import java.util.*;

//
//5                   5 
//5 4               4 5 
//5 4 3           3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2 1 0 1 2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3           3 4 5 
//5 4               4 5 
//5                   5
public class Q2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, nsp = 2 * n - 1, row = 0, col = 0;
		while (row < 2 * n + 1) {
			col = 0;
			int star1 = n;
			while (col < nst) {
				if (row == n && col == nst - 1) {
					System.out.print("0 ");
				} else {
					System.out.print(star1 + " ");
				}

				star1--;
				col++;
			}
			col = 0;
			while (col < nsp) {

				System.out.print("  ");
				col++;
			}
			col = 0;
			int star2 = n > row ? n - row : row - n;
			if (row == n) {
				star2 = 1;
			}
			while (col < nst) {
				if (row == n && col == nst - 1) {
					System.out.print(" ");
				} else {
					System.out.print(star2 + " ");
				}

				star2++;
				col++;
			}
			System.out.println();
			if (row < n) {
				nst++;
				nsp -= 2;
			} else {
				nst--;
				nsp += 2;
			}
			row++;
		}
	}

}
