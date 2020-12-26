package practice.task_1.Exercise_6;

public class DividedBy57_6_4 {
	public static void dividedby57(int[] arr) {
		System.out.print("Values, divided by 5 or 7: ");
		for (int x : arr) {
			if (x % 5 == 0 || x % 7 == 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}
}
