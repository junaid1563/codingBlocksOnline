package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q6 {
//	Sample Input
//
//	7
//
//	Sample Output
//
//	 1******
//	 12*****
//	 123****
//	 1234***
//	 12345**
//	 123456*
//	 1234567
//

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int row = 0, col = 0, nst1 = 1, nst2 = n - 1;
		while (row < n) {
			col = 1;
			while (col <= nst1) {
				System.out.print(col);
				col++;
			}
			col = 1;
			while (col <= nst2) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			nst1++;
			nst2--;
			row++;
		}

	}

}
