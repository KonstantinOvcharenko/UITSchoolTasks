package examples;

public class SampleSwitch {
	public static void main(String[] args) {
		int i = 2;

		switch (i) {
		case 0:
			System.out.println("i is zero");
			break;
		case 1:
			System.out.println("i is one");
			break;
		case 2:
			System.out.println("i is two");
			break;
		case 3:
			System.out.println("i is three");
			break;
		default:
			System.out.println("no match");
		}
	}
}
