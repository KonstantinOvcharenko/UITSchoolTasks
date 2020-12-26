package practice.task_2.Exercise_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo_9_0 {
	public static void main(String[] args) {
		System.out.print("Enter dimension of the matrix: ");
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		scan.close();
		int[][] matrix = new int[n][n];
		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = rand.nextInt(2 * n + 1) - n;
			}
		}
		System.out.println("----------< Result matrix >----------");
		for (int[] x : matrix) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		Exercise_9_1.sort(matrix);
		Exercise_9_2.cycle_shift(matrix, 9);
		Exercise_9_3.increasing_elements(matrix);
		Exercise_9_4.btwn_two_positive(matrix);
		Exercise_9_5.rotate_matrix_left(matrix, 90);
		Exercise_9_6.minus_average(matrix);
		System.out.println();
		int[][] data = { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 1, 2, 0, 0, 3, 4, 0 },
				{ 0, 0, 5, 6, 0, 0, 7, 8, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 2, 0, 0, 3, 4, 0 }, { 0, 0, 5, 6, 0, 0, 7, 8, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, };
		for (int[] i : data) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();
		data = Exercise_9_7.condense_matrix(data);
		for (int[] i : data) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println();

		int[][] data2 = { { 0, 3, 0, 5, 0, 0, 5, 0, 6 }, { 0, 0, 0, 3, 4, 5, 0, 6, 0 }, { 3, 5, 0, 0, 7, 6, 9, 0, 0 } };
		data2 = Exercise_9_8.zero_sort(data2);
		for (int[] i : data2) {
			System.out.println(Arrays.toString(i));
		}
	}
}
