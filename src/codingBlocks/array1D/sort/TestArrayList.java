package codingBlocks.array1D.sort;

import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList(10);
		System.out.println(arr.getSize());
		arr.add(1);
		arr.add(2);
		System.out.println(arr.getSize());
		arr.add(3);
		System.out.println(arr.getSize());
		System.out.println(arr.toString());
		arr.remove();
		System.out.println(arr.toString());
		arr.add(11);
		arr.add(21);
		System.out.println(arr.toString());

	}

}
