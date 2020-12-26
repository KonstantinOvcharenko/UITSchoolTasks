package examples;

public class Main {
	public static void main(String[] args) {
		Ball sd = new Ball("red");
		System.out.println(sd);
		System.out.println(Ball.getCount());
		System.out.println(Ball.count);

		B a = new B();
		System.out.println("Hello world!" + B.d);
		B.sd();
	}
}
