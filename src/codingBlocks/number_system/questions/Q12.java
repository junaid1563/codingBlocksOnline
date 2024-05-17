package codingBlocks.number_system.questions;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		C = (5/9)(F – 32)
		int min = scn.nextInt();
		int max = scn.nextInt();
		int step = scn.nextInt();

		double cTemp = min;

		while (cTemp <= max) {
			int minTemp = (int) ((5.0 / 9) * (cTemp - 32));

			System.out.println((int)cTemp + " " + minTemp);
			cTemp += step;
		}
	}

}
