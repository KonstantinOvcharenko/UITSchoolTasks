package examples;

public class AccessTest {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		ob.a = 10;
		ob.b = 20;
		// ob.c=100;

		ob.setc(100);
		System.out.println("a,b and c: " + ob.a + " " + ob.b + " " + ob.getc());
	}
}
