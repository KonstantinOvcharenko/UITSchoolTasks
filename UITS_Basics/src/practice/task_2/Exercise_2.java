package practice.task_2;

public class Exercise_2 {
	public static void sort(String[] data) {
		for (int k = 1; k < data.length; k++) {
			String newElement = data[k];
			int location = k - 1;
			while (location >= 0 && data[location].length() > newElement.length()) {
				data[location + 1] = data[location];
				location--;
			}
			data[location + 1] = newElement;
		}
	}
}
