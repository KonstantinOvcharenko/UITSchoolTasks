package practice.task_1.Exercise_6;

public class DividedBy39_6_3 {
	public static void dividedby39(int[] arr) {
		System.out.print("Values, divided by 3 or 9: ");
		for (int x : arr) {
			if (x % 3 == 0 || x % 9 == 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}
}
