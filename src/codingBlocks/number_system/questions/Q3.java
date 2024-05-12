package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q3 {
//  5 4 3 2 1 0 1 2 3 4 5
//    4 3 2 1 0 1 2 3 4 
//      3 2 1 0 1 2 3 
//        2 1 0 1 2 
//          1 0 1 
//            0 
//          1 0 1 
//        2 1 0 1 2 
//      3 2 1 0 1 2 3 
//    4 3 2 1 0 1 2 3 4 
//  5 4 3 2 1 0 1 2 3 4 5
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n");
		int n = scn.nextInt();
		int row = 0, col = 0, nsp = 0, nst = 2 * n + 1;
		while (row < 2 * n + 1) {
			col = 0;

			while (col < nsp) {
				System.out.print("  ");
				col++;
			}
			int star1 = row <= n ? (n - row) : (row - n);
			col = 0;
			while (col < nst) {

				System.out.print(Math.abs(star1) + " ");
				col++;
				star1--;
			}
			System.out.println();
			if (row < n) {
				nsp++;
				nst -= 2;
			} else {
				nsp--;
				nst += 2;
			}
			row++;
		}

	}

}
