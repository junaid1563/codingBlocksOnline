package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q16 {
	// decimal to octal

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int divident = n, divisor = 8, rem = 0, mul = 10, x = 0, ans = 0;
		while (divident != 0) {
			rem = divident % divisor;
			divident = divident / divisor;
			ans += rem * Math.pow(mul, x);
			x++;
		}
		System.out.println(ans);
	}

}
