package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q20 {
//	Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if(checkPrime(n)) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

	public static boolean checkPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
