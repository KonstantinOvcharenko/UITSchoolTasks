package practice.task_2.Exercise_9;

import java.util.Arrays;

public class Exercise_9_7 {
	public static int[][] condense_matrix(int[][] arr) {
		System.out.println("----------< Matrix condensation >---------- ");
		// Condense by raws
		int zero_raws = arr.length;
		for (int raw = 0; raw < arr.length; raw++) {
			for (int j = raw; j < arr.length; j++) {
				boolean t = false;
				for (int n : arr[j])
					if (n != 0) {
						t = true;
						break;
					}
				if (t == true && raw != j) {
					zero_raws--;
					int[] tmp = new int[arr[raw].length];
					System.arraycopy(arr[raw], 0, tmp, 0, arr[raw].length);
					System.arraycopy(arr[j], 0, arr[raw], 0, arr[j].length);
					System.arraycopy(tmp, 0, arr[j], 0, tmp.length);
					break;
				}

			}
		}
		arr = Arrays.copyOf(arr, arr.length - zero_raws);
		// Condensing by columns
		int columns = arr[0].length;
		while (columns >= 0) {
			for (int p = 0; p < columns; p++) {
				boolean t = true;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i][p] != 0) {
						t = false;
						break;
					}
				}
				if (t == true) {
					for (int k = 0; k < arr.length; k++) {
						if (p < columns - 1) {
							System.arraycopy(arr[k], p + 1, arr[k], p, arr[k].length - 1 - p);
						}
						arr[k] = Arrays.copyOf(arr[k], arr[k].length - 1);
					}
					break;
				}
			}
			columns--;
		}
		return arr;
	}
}
