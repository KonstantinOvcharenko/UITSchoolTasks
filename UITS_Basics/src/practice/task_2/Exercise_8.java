package practice.task_2;

import java.util.Arrays;

public class Exercise_8 {
	public static void show_matrix(int k) {
		if ((int) Math.sqrt(k) == Math.sqrt(k)) {
			int n = (int) Math.sqrt(k);
			int[][] matrix = new int[n][n];
			int p = 1;
			for (int i = 0; i < matrix.length; i++)
				for (int j = 0; j < matrix.length; j++) {
					matrix[i][j] = p++;
				}
			System.out.println("Matrix NxN from 1 to k: ");
			for (int[] x : matrix) {
				System.out.print(Arrays.toString(x));
				System.out.println();
			}
		}
	}
}
