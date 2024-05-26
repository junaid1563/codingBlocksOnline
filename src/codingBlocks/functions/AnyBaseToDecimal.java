package codingBlocks.functions;

import java.util.Scanner;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int base = scn.nextInt();
		int ans = decimalToAny(n, base);
		System.out.println(ans);
		
	}

	public static int anyToDecimal(int n, int base) {
		int ans = 0;
		int divident = n, divisor = 10, mul = base, x = 0;
		while (divident != 0) {
			int rem = divident % divisor;
			ans += rem * Math.pow(mul, x);
			x++;
			divident = divident / divisor;
		}
		return ans;
	}

	public static int decimalToAny(int n, int base) {
		int ans = 0;
		int divident = n, divisor = base, mul = 10, x = 0;
		while (divident != 0) {
			int rem = divident % divisor;
			ans += rem * Math.pow(mul, x);
			x++;
			divident = divident / divisor;
		}
		return ans;
	}

}
