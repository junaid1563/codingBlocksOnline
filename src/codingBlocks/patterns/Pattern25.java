package codingBlocks.patterns;

import java.util.Scanner;

public class Pattern25 {
	
//    1
//   222
//  33333
// 4444444
//555555555
//
//n=5

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int row = 1;
		int nsp = n - 1;
		int nst = 1;
		int val=1;

		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) { 
				System.out.print("\t");
				csp++;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print(val+ "\t");
				cst++;

			}
			// prep work

			nsp--;
			nst += 2;
			row++;
			val++;
			System.out.println();
		}

	}

}
