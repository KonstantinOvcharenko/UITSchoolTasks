package practice.task_1;

public class Exercise_1 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello, " + args[0] + "!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No name in command line!");
		}
	}
}
