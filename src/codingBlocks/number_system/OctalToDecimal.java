package codingBlocks.number_system;

import java.util.Scanner;

public class OctalToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a octal number");
		int n = scn.nextInt();
		int decimalNumber = octalToDecimal(n);
		System.out.println("Decimal number = " + decimalNumber);

	}

	public static int octalToDecimal(int n) {
		int divident = n, divisor = 10, remainder = 0, answer = 0, multiplier = 8, x = 0;
		while (divident != 0) {
			remainder = divident % divisor;
			divident = divident / divisor;
			answer += remainder * Math.pow(multiplier, x);
			x++;
		}
		return answer;

	}

}
