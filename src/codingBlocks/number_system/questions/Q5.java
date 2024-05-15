package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q5 {
//	Sample Input
//
//	5
//
//	Sample Output
//
//	1 2 3 4 5
//	1 2 3 4 * 
//	1 2 3 * * *
//	1 2 * * * * *
//	1 * * * * * * *
//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 0, col = 0, nst1 = n, nst2 = -1;
		while (row < n) {
			col = 1;
			while (col <= nst1) {
				System.out.print(col + " ");
				col++;
			}
			col = 1;
			while (col <= nst2) {
				System.out.print("* ");
				col++;
			}
			System.out.println();

			nst1--;
			nst2 += 2;
			row++;

		}
	}

}
