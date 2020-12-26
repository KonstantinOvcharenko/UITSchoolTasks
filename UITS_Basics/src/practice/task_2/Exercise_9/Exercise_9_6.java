package practice.task_2.Exercise_9;

public class Exercise_9_6 {
	public static void minus_average(int[][] arr) {
		double[][] data = new double[arr.length][arr.length];
		for (int i = 0; i < data.length; i++) {
			int sum = 0;
			double average = 0.0;
			for (int k = 0; k < data.length; k++) {
				sum += arr[i][k];
			}
			average = sum / (double) data.length;
			for (int j = 0; j < data.length; j++) {
				data[i][j] = (arr[i][j] - average);
			}
		}
		System.out.println("----------< Matrix - average >---------- ");
		for (double[] x : data) {
			for (double y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
