package practice.task_2.Exercise_9;

public class Exercise_9_4 {
	public static void btwn_two_positive(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int pos = 0;
			for (int p = 0; p < arr[i].length; p++) {
				if (arr[i][p] > 0)
					pos++;
			}
			if (pos >= 2) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] > 0 && j < arr[i].length - 2) {
						int k = j + 1;
						while (arr[i][k] <= 0) {
							sum += arr[i][k];
							k++;
						}
						break;
					}
				}
			}
		}
		System.out.println("Sum of elements between two positive: " + sum);
	}
}
