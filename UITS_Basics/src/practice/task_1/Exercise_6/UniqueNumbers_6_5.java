package practice.task_1.Exercise_6;

public class UniqueNumbers_6_5 {
	public static void unique_numbers_6_5(String[] arr) {
		System.out.print("3-digit values with unique digits: ");
		for (String s : arr) {
			if (s.length() == 3) {
				if (s.charAt(0) != s.charAt(1) && s.charAt(0) != s.charAt(2) && s.charAt(1) != s.charAt(2))
					System.out.print(s + " ");
			}
		}
		System.out.println();
	}
}
