package practice.labs_1;

import java.util.Arrays;

public class Lab_6_Matrix_Mult {
	public static int[][] multiplication(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b[0].length];
		if (a == null || b == null)
			throw new IllegalArgumentException();

		if ((a instanceof int[][]) && (b instanceof int[][])) {
		} else {
			throw new IllegalArgumentException();
		}

		for (int[] v : a)
			if (v == null)
				throw new IllegalArgumentException();
		for (int[] c : b)
			if (c == null)
				throw new IllegalArgumentException();

		if (a[0].length == b.length) {
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						result[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 7, 8 }, { 3, 4 } };
		int[][] b = { { 3, 4, 5, 6 }, { 9, 0, 1, 2 } };
		System.out.println(Arrays.deepToString(multiplication(a, b)));
	}
}
