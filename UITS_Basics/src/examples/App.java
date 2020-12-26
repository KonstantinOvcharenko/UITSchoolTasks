package examples;

public class App {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;

		/*
		 * int tmp = a; a = b; b = tmp;
		 */

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}
