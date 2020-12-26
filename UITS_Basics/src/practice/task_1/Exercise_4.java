package practice.task_1;

public class Exercise_4 {
	public static void main(String[] args) {
		String password = "admin";
		try {
			if (password.equals(args[0])) {
				System.out.println("Access granted!");
			} else {
				System.out.println("Access denied!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No password!");
		}
	}
}
