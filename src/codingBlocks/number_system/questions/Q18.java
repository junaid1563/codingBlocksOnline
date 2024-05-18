package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q18 {


//Take N (number of rows), print the following pattern (for N = 4)
//0
//1 1
//2 3 5
//8 13 21 34
//Input Format
//
//Constraints
//
//0 < N < 100
//Output Format
//
//Sample Input
//
//4
//
//Sample Output
//
//0 
//1    1 
//2    3     5 
//8   13    21    34
//
//Explanation
//
//Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// n fibonacci series f(n)=f(n-1)+f(n-2)
//		int a = 0, b = 1;
//		while (n != 2) {
//			int c = a + b;
//			a = b;
//			b = c;
//			n--;
//			System.out.println(c);
//		}

		int nst = 1, row = 0, col = 0, a = 0, b = 1;
		while (row < n) {
			col = 0;

			while (col < nst) {
				System.out.print(a + " ");
				int c = a + b;
				a = b;
				b = c;

				col++;
			}
			System.out.println();
			nst++;
			row++;
		}
	}

}
