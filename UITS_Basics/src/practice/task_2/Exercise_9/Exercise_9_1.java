package practice.task_2.Exercise_9;

public class Exercise_9_1 {
	public static void sort(int[][] matrix) {
		int[][] arr = new int[matrix.length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			System.arraycopy(matrix[i], 0, arr[i], 0, matrix[i].length);
		}
		for (int[] m : arr) {
			for (int barrier = m.length - 1; barrier >= 0; barrier--) {
				for (int index = 0; index < barrier; index++) {
					if (m[index] > m[index + 1]) {
						int tmp = m[index + 1];
						m[index + 1] = m[index];
						m[index] = tmp;
					}
				}
			}
		}
		System.out.println("----------< Sorted matrix >---------- ");
		for (int[] x : arr) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
