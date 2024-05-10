package codingBlocks.number_system;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a decimal number");
		int n = scn.nextInt();
		int octalNumber = decimalToOctal(n);
		System.out.println("Octal number = " + octalNumber);

	}

	public static int decimalToOctal(int n) {
		int divident = n, divisor = 8, remainder = 0, answer = 0, multiplier = 10, x = 0;
		while (divident != 0) {
			remainder = divident % divisor;
			divident = divident / divisor;
			answer += remainder * Math.pow(multiplier, x);
			x++;
		}
		return answer;
	}
}
