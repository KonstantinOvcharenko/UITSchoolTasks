package practice.task_2.Exercise_9;

public class Exercise_9_8 {
	public static int[][] zero_sort(int[][] arr) {
		System.out.println("----------< Zeros at the end >---------- ");
		for (int[] s : arr) {
			for (int barrier = s.length - 1; barrier >= 0; barrier--) {
				for (int index = 0; index < barrier; index++) {
					if (s[index] == 0) {
						int tmp = s[index];
						s[index] = s[index + 1];
						s[index + 1] = tmp;
					}
				}
			}
		}
		return arr;
	}
}
