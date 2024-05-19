package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q22 {

//
//
//Take N (number of rows), print the following pattern (for N = 5)
//1
//2 2
//3 0 3
//4 0 0 4
//5 0 0 0 5
//Input Format
//
//There will be an integer in input.
//Constraints
//
//0 < N < 100
//Output Format
//
//Print the pattern.
//Sample Input
//
//5
//
//Sample Output
//
//1  
//2	2  
//3	0	3    
//4	0	0	4  
//5	0	0	0	5
//

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = 1, row = 0, col = 0;
		while (row < n) {
			col = 1;
			while (col <= nst) {
				if (col == 1 || col == nst) {
					System.out.print(nst + " ");
				} else {
					System.out.print(0 + " ");
				}
				col++;

			}
			System.out.println();
			nst++;
			row++;
		}

	}

}
