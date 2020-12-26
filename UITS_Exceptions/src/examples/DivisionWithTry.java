package examples;

public class DivisionWithTry {
	public static void main(String[] args) {
		int d, a;
		try {
			d = 0;
			a = 42 / d;
			System.out.println("Этот текст никогда не будет напечатан");
		} catch (ArithmeticException e) {
			System.out.println("Деление на ноль");
		}
		System.out.println("После блока try-catch");
	}
}
