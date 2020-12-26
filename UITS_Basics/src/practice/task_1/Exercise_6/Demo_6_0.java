package practice.task_1.Exercise_6;

import java.util.Scanner;

public class Demo_6_0 {
	public static void main(String[] args) {
		System.out.print("Enter your values: ");
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		scan.close();
		int[] nums = new int[line.length];
		for (int i = 0; i < line.length; i++) {
			nums[i] = Integer.parseInt(line[i]);
		}

		EvenOdd_6_1.even_odd(nums);
		GreaterSmaller_6_2.greater_smaller(nums);
		DividedBy39_6_3.dividedby39(nums);
		DividedBy57_6_4.dividedby57(nums);
		UniqueNumbers_6_5.unique_numbers_6_5(line);
		LuckyNumbers_6_6.lucky_numbers(line);
		HalfSum_6_7.half_sum(nums);
	}
}
