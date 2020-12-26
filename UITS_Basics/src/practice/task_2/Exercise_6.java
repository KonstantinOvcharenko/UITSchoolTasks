package practice.task_2;

public class Exercise_6 {
	public static void increasing_only(String[] data) {
		for (String s : data) {
			boolean t = true;
			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) < s.charAt(i + 1)) {
				} else {
					t = false;
					break;
				}

			}
			if (t == true) {
				System.out.println("Number with only increasing digits: " + s);
				break;
			}
		}
	}
}
