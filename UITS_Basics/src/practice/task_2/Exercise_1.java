package practice.task_2;

public class Exercise_1 {
	public static void long_short(String[] data) {
		int min = 32;
		int max = 1;
		int min_index = 0;
		int max_index = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i].length() < min) {
				min = data[i].length();
				min_index = i;
			}
			if (data[i].length() > max) {
				max = data[i].length();
				max_index = i;
			}
		}
		System.out.print("Shortest and longest values: " + data[min_index] + " [" + data[min_index].length() + "] ");
		System.out.println(data[max_index] + " [" + data[max_index].length() + "]");
	}
}
