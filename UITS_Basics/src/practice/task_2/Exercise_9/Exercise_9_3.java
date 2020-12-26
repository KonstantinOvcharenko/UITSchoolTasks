package practice.task_2.Exercise_9;

public class Exercise_9_3 {
	public static void increasing_elements(int[][] arr) {
		int global = 0;
		int current = 1;
		int tmp = 0;
		int i = 0;
		while (i < arr.length) {
			int j = 0;
			if (i > 0 && tmp < arr[i][j]) {
				current++;
			} else {
				if (current > global)
					global = current;
				current = 1;
			}
			while (j < arr[i].length - 1) {
				if (arr[i][j] < arr[i][j + 1]) {
					current++;
				} else {
					if (current > global)
						global = current;
					current = 1;
				}
				j++;
			}
			tmp = arr[i][j];
			i++;
		}
		System.out.println("Maximum of increasing elements: " + global);
	}
}
