package practice.task_2;

public class Exercise_3 {
	public static void mid_length(String[] data) {
		int sum = 0;
		for (String s : data) {
			sum += s.length();
		}
		int mid_length = sum / data.length;
		System.out.print("Numbers with length > mid-length: ");
		for (String s : data) {
			if (s.length() > mid_length)
				System.out.print(s + " [" + s.length() + "] ");
		}
		System.out.println();
	}
}
