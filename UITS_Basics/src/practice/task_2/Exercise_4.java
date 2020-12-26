package practice.task_2;

public class Exercise_4 {
	public static void min_of_digits(int[] arr) {
		int min_of_digits = 0;
		int dif_digits = 10;
		for (int x : arr) {
			int nums = 0;
			int local_dif_digits = 0;
			while (nums < 10) {
				int p = x;
				while (p > 0) {
					if (p % 10 == nums) {
						local_dif_digits++;
						break;
					}
					p /= 10;
				}
				nums++;
			}
			if (local_dif_digits < dif_digits) {
				dif_digits = local_dif_digits;
				min_of_digits = x;
			}
		}
		System.out.println("Number with minimum of different digits: " + min_of_digits);
	}
}
