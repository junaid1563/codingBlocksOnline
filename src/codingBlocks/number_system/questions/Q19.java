package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q19 {
//	input 4
//	output
//   	  1 
//  	2 3 2 
//	  3 4 5 4 3 
//  4 5 6 7 6 5 4 

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nsp = n - 1, nst = 1, row = 0, col = 0;
		while (row < n) {
			col = 0;
			while (col < nsp) {
				System.out.print("  ");
				col++;
			}
			col = 0;
			int star = row + 1;
			while (col < nst) {
				System.out.print(star + " ");

				if (col < nst / 2) {
					star++;
				} else {
					star--;
				}
				col++;

			}
			System.out.println();
			nst += 2;
			nsp--;
			row++;

		}

	}

}
