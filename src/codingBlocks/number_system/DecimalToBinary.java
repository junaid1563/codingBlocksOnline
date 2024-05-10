package codingBlocks.number_system;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter a number");
		int n = scn.nextInt();
		int bin = decimalToBinary(n);
		System.out.println("Binary of " + n + " is " + bin);

	}

	// this method can do decimal to binary number system conversion

	public static int decimalToBinary(int n) {
		int divident = n;
		int divisor = 2;
		int multiplier = 1;
		int remainder = 0;
		int answer = 0;
		while (divident != 0) {
			remainder = divident % divisor;
			divident = divident / divisor;
			answer = answer + remainder * multiplier;
			multiplier = multiplier * 10;

		}

		return answer;
	}

	public static int decimalToBinary2(int dec) {
		int num = 0, divident = dec, divisor = 2, mul = 10, x = 0;
		while (divident != 0) {
			int rem = divident % divisor;
			divident = divident / divisor;
			num += rem * Math.pow(mul, x);
			x++;
		}
		return num;
	}

}
