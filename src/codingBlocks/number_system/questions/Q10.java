package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q10 {

	/*
	 * Given a series of N Integers, check if it is possible to split sequence into
	 * two sequences - s1 to si and si to sN such that first sequence is strictly
	 * decreasing and second is strictly increasing. Print true/false as output.
	 * Input Format
	 * 
	 * First line contains a single integer N denoting the number of elements int
	 * the series. Next N lines contain a single integer each denoting the elements
	 * of the array S. Constraints
	 * 
	 * 0 < N < 1000 Each number in sequence S is > 0 and < 1000000000 Output Format
	 * 
	 * Print boolean output - "true" or "false" defining whether the sequence is
	 * increasing - decreasing or not. Sample Input
	 * 
	 * 5 1 2 3 4 5
	 * 
	 * Sample Output
	 * 
	 * true
	 * 
	 */

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		System.out.println("Enter n");
		int n = scn.nextInt();
		if (n < 0 || n > 1000) {
			System.out.println(false);
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println(printSequencePossiblity(n, arr));

	}

	public static boolean printSequencePossiblity(int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
