package examples;

public class StrToNum {
	public static void main(String[] args) {
		String strInt = "123";
		String strDouble = "123.456";

		int x;
		double y;
		x = Integer.parseInt(strInt);
		y = Double.parseDouble(strDouble);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		strInt = String.valueOf(x);
		strDouble = String.valueOf(y);
		System.out.println("strInt= " + strInt);
		System.out.println("strDouble= " + strDouble);
		String str;
		str = "num= " + 345;
		System.out.println(str);
	}
}
