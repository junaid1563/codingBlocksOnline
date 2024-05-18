package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q17 {

//
//Take N (number of rows), print the following pattern (for N = 4).
//
//                       1           1
//                       1 2       2 1  
//                       1 2 3   3 2 1
//                       1 2 3 4 3 2 1   
//
//Input Format
//
//Constraints
//
//0 < N < 10
//Output Format
//
//Sample Input
//
//4
//
//Sample Output
//
//1						1
//1	2				2	1
//1	2	3		3	2	1
//1	2	3	4	3	2	1

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, nsp = 2 * n - 3, row = 0, col = 0;
		while (row < n) {
			col = 0;
			while (col < nst) {
				System.out.print(col + 1 + " ");
				col++;
			}
			col = 0;
			while (col < nsp) {
				System.out.print("  ");
				col++;
			}
			col = 0;
			int star = row + col + 1;
			if (row == n - 1) {
				star = row + col;
				col = 1;

			}
			while (col < nst) {
				System.out.print(star + " ");
				star--;
				col++;
			}

			System.out.println();
			nst++;
			nsp -= 2;
			row++;
		}
	}

}
