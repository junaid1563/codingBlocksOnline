package codingBlocks.array2D;

import java.util.Scanner;

public class TakeInputAndDisplay {

	public static void main(String[] args) {

		int[][] arr = takeInput();
		display(arr);
	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] takeInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of rows");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];

		for (int row = 0; row < rows; row++) {
			System.out.println("Enter the length of cols for row " + row);
			int cols = scn.nextInt();
			arr[row] = new int[cols];

			for (int col = 0; col < cols; col++) {
				System.out.println("Enter element for row " + row + " and col " + col);
				arr[row][col] = scn.nextInt();
			}
		}
		return arr;
	}
}
