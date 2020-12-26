package practice.task_2.Exercise_9;

public class Exercise_9_5 {
	public static void rotate_matrix_left(int[][] matrix, int degree) {
		int steps = degree / 90;
		for (int s = 0; s < steps; s++) {
			for (int i = 0; i < matrix.length / 2; i++) {
				for (int j = i; j < matrix.length - 1; j++) {
					int tmp = matrix[i][j];// 1
					matrix[i][j] = matrix[j][matrix.length - 1 - i];// 2
					matrix[j][matrix.length - 1 - i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];// 3
					matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[matrix.length - 1 - j][i];// 4
					matrix[matrix.length - 1 - j][i] = tmp;// 5
				}
			}
		}
		System.out.println("----------< Rotated matrix >---------- ");
		for (int[] x : matrix) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
