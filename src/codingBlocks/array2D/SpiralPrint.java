package codingBlocks.array2D;

public class SpiralPrint {
//	1 2 3 4
//	5 6 7 8
//	9 10 11 12
//	13 14 15 16

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		spiralPrint(arr);
	}

	private static void spiralPrint(int[][] arr) {
		int minRow = 0, maxRow = arr.length - 1, minCol = 0, maxCol = arr[0].length - 1;
		while (maxCol >= minCol) {
			int row = 0, col = 0;
//	upper row
			for (col = minCol; col <= maxCol; col++) {
				System.out.print(arr[minRow][col] + " ");
			}
			col--;
			minRow++;
//			right column
			for (row = minRow; row <= maxRow; row++) {
				System.out.print(arr[row][col] + " ");
			}
			row--;
			maxCol--;

// down row
			for (col = maxCol; col >= minCol; col--) {
				System.out.print(arr[row][col] + " ");
			}
			col++;
			maxRow--;

			// left col
			for (row = maxRow; row >= minRow; row--) {
				System.out.print(arr[row][col] + " ");
			}
			row++;

			minCol++;
		}
	}

}
