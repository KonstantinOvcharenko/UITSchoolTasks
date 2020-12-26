package examples;

import java.util.Arrays;

public class ArraysToStringDemo {
	public static void main(String[] args) {
		int[] array1D = { 0, 1, 2, 3 };
		int[][] array2D = { { 0, 1 }, { 2, 3 } };

		System.out.println(array1D);
		System.out.println(Arrays.toString(array1D));

		System.out.println(array2D);
		System.out.println(Arrays.toString(array2D));
		System.out.println(Arrays.deepToString(array2D));
	}
}
