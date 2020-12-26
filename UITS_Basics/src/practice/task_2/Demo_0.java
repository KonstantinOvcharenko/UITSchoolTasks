package practice.task_2;

import java.util.Scanner;

public class Demo_0 {
	public static void main(String[] args) {
		System.out.print("Enter your numbers: ");
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		scan.close();
		int[] nums = new int[line.length];
		for (int i = 0; i < line.length; i++)
			nums[i] = Integer.parseInt(line[i]);

		Exercise_1.long_short(line);
		Exercise_2.sort(line);
		Exercise_3.mid_length(line);
		Exercise_4.min_of_digits(nums);
		Exercise_5.even_odd(nums);
		Exercise_6.increasing_only(line);
		Exercise_7.different_digits(nums);
		Exercise_8.show_matrix(49);
	}
}
