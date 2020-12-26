package practice.task_2;

public class Exercise_5 {
	public static void even_odd(int[] arr) {
		int even = 0;
		int even_odd = 0;

		for (int x : arr) {
			int even_dig = 0;
			int odd_dig = 0;
			boolean e = true;
			while (x > 0) {
				if ((x % 10) % 2 == 0) {
					even_dig++;
				}
				if ((x % 10) % 2 != 0) {
					odd_dig++;
					e = false;
				}
				x /= 10;
			}
			if (even_dig == odd_dig)
				even_odd++;
			if (e == true)
				even++;
		}

		System.out.println("Amount of numbers with only even digits: " + even + ", with even=odd digits: " + even_odd);
	}
}
