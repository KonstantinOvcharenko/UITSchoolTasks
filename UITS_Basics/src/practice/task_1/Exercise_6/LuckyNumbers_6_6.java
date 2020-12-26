package practice.task_1.Exercise_6;

public class LuckyNumbers_6_6 {
	public static void lucky_numbers(String[] arr) {
		System.out.print("Lucky numbers: ");
		for (String s : arr) {
			if (s.length() % 2 == 0) {

				int sum1 = 0;
				int sum2 = 0;

				for (int i = 0; i < s.length() / 2; i++) {
					sum1 += s.charAt(i);
				}

				for (int i = s.length() / 2; i < s.length(); i++) {
					sum2 += s.charAt(i);
				}
				if (sum1 == sum2)
					System.out.print(s + " ");
			}
		}
		System.out.println();
	}
}
