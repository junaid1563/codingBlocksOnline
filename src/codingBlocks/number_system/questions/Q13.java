package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int divident = num, divisor = 10, rem = 0, mul = 2, x = 0;
		int ans = 0;
		while (divident != 0) {
			rem = divident % divisor;
			ans += rem * Math.pow(mul, x);
			x++;
			divident = divident / divisor;
		}
		System.out.println(ans);
	}

}
