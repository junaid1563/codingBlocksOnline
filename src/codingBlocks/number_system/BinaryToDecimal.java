package codingBlocks.number_system;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int divisor = 10;
		System.out.println("Enter a binary Number");
		int divident = scn.nextInt();
		int remainder = 0;
		int multiplier = 1;
		int n = divident;
		int answer = 0;
		while (n != 0) {
			remainder = n % divisor;
			n = n / divisor;
			answer = answer + remainder * multiplier;
			multiplier = 2 * multiplier;
		}
		System.out.println("Binary to Decimal = " + answer);

	}

}
