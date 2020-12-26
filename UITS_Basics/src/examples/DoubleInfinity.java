package examples;

public class DoubleInfinity {
	public static void main(String[] args) {
		int a = 7;
		double b = 0.0;
		double c = -0.0;
		double d = 2.5;
		double g = Double.NEGATIVE_INFINITY;

		System.out.println(a / b);
		System.out.println(a / c);
		System.out.println(b == c);
		System.out.println(d / 0);
		System.out.println(g * 0);
	}
}
