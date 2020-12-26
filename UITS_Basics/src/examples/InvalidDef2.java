package examples;

public class InvalidDef2 {
	public static void main(String[] args) {
		byte b1 = 50, b2 = -99;
		short k = (short) (b1 + b2);
		System.out.println("k= " + k);
	}
}
