package practice.task_2;

public class Exercise_7 {
	public static void different_digits(int[] arr) {
		for (int x : arr) {
			boolean t = true;
			int num = 0;
			while (num < 10) {
				int repeats = 0;
				int p = x;
				while (p > 0) {
					if (p % 10 == num)
						repeats++;
					p /= 10;
				}
				if (repeats > 1) {
					t = false;
					break;
				} else {
					num++;
				}
			}
			if (t == true) {
				System.out.println("Number with only different digits: " + x);
				break;
			} else {
				continue;
			}
		}
	}
}
