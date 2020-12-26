package practice.task_1.Exercise_6;

public class GreaterSmaller_6_2 {
	public static void greater_smaller(int[] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
		}
		System.out.print("Greatest value: " + max + "\n");
		System.out.print("Smallest values: " + min);
		System.out.println();
	}
}
