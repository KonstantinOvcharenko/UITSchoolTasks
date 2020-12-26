package practice.task_1.Exercise_6;

public class HalfSum_6_7 {
	public static void half_sum(int[] arr) {
		System.out.print("Values which are equal to half-sum of neighbours: ");
		for (int i = 1; i < arr.length - 1; i++) {
			int half_sum = (arr[i - 1] + arr[i + 1]) / 2;
			if (arr[i] == half_sum)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
