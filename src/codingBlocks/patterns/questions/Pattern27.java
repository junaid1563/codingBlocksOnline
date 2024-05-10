package codingBlocks.patterns.questions;

import java.util.Scanner;

public class Pattern27 {

//	                 1
//					121
//		           12321
//			      1234321
//				 123454321
//
//n=5

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int row = 1;
        int nsp = n - 1;
        int nst = 1;


        while (row <= n) {
            int csp = 1;
            while (csp <= nsp) {
                System.out.print("\t");
                csp++;
            }
            int cst = 1;
            int val = 1;
            while (cst <= nst) {
                System.out.print(val + "\t");
                cst++;
                if (cst <= nst / 2 + 1) {
                    val++;
                } else {
                    val--;
                }

            }
            // prep work

            nsp--;
            nst += 2;
            row++;
            System.out.println();
        }

    }

}
