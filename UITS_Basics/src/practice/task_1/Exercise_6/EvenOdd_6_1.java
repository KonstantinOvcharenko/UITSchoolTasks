package practice.task_1.Exercise_6;

public class EvenOdd_6_1 {
	public static void even_odd(int[] arr) {
		System.out.print("Even numbers: ");
		for (int x : arr) {
			if (x % 2 == 0)
				System.out.print(x + " ");
		}
		System.out.println();
		System.out.print("Odd numbers: ");
		for (int x : arr) {
			if (x % 2 != 0)
				System.out.print(x + " ");
		}
		System.out.println();
	}
}
