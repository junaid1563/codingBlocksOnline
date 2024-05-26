package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int ans = nthPrime(n);
		System.out.println(ans);
	}

	public static int nthPrime(int n) {
		int ans = 2;
		int count = 1;

		while (count <= n) {

			boolean isPrime = checkPrime(ans);
			if (isPrime) {
				count++;
			}
			ans++;
		}
		return ans - 1;
	}

	public static boolean checkPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
