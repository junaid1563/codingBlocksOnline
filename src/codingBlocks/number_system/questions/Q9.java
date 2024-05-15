package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q9 {

//
//
//Take the following as input.
//
//A number (N1)
//A number (N2)
//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n1 = sn.nextInt();
		int n2 = sn.nextInt();
		int count = 0;
		int i = 1;
		while (count < n1) {
			int num = 3 * i + 2;
			if (num % n2 != 0) {
				System.out.println(num);
				count++;
			}
			i++;

		}
	}

}
