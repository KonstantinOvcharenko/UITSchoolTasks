package practice.task_2.Exercise_9;

public class Exercise_9_2 {
	public static void cycle_shift(int[][] matrix, int step) {
		for (int[] l : matrix) {
			int realSteps = step % l.length;
			int[] tmp = new int[l.length];
			for (int i = 0; i < l.length; i++) {
				int newPosition = (i - realSteps) < 0 ? i - realSteps + l.length : i - realSteps;
				tmp[newPosition] = l[i];
			}
			System.arraycopy(tmp, 0, l, 0, tmp.length);
		}
		System.out.println("----------< Shifted matrix >---------- ");
		for (int[] x : matrix) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}
}
