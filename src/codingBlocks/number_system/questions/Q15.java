package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q15 {
	// count how many times the given digit is present in number n

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int digit = scn.nextInt();
		int ans = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			if (rem == digit) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
