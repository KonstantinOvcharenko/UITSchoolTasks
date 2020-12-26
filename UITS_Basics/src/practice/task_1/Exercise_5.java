package practice.task_1;

public class Exercise_5 {
	public static void main(String[] args) {
		System.out.print("Command Line Args: ");
		for (String s : args)
			System.out.print(s + " ");
		System.out.println();
		int sum = 0;
		int comp = 1;
		for (String s : args) {
			sum += Integer.parseInt(s);
		}
		for (String s : args) {
			comp *= Integer.parseInt(s);
		}
		System.out.println("Summation: " + sum);
		System.out.println("Composition: " + comp);
	}
}
