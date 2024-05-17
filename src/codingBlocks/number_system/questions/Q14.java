package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q14 {

	/*
	 * Take the following as input.
	 * 
	 * A number Write a function which returns true if the number is an armstrong
	 * number and false otherwise, where Armstrong number is defined as follows.
	 * 
	 * A positive integer of n digits is called an Armstrong number of order n
	 * (order is number of digits) if.
	 * 
	 * abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….
	 * 
	 * 1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4
	 * 
	 * 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3 Input Format
	 * 
	 * Single line input containing an integer Constraints
	 * 
	 * 0 < N < 1000000000 Output Format
	 * 
	 * Print boolean output for each testcase. "true" if the given number is an
	 * Armstrong Number, else print "false". Sample Input
	 * 
	 * 371
	 * 
	 * Sample Output
	 * 
	 * true
	 * 
	 */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int digitCount = 0;
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			temp = temp / 10;
			digitCount++;
		}
		temp = num;
		while (temp != 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, digitCount);
			temp = temp / 10;
		}
		System.out.println(sum == num);
	}

}
