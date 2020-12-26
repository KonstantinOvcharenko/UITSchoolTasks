package examples;

public class DemoBlackBox {
	public static void main(String[] args) {
		BlackBox object1 = new BlackBox(5, 10);
		BlackBox object2 = new BlackBox(5, 10);
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object1.hashCode() == object2.hashCode());

		BlackBox object3 = new BlackBox(5, 10);
		BlackBox object4 = object3;
		System.out.println(object3.equals(object4));

	}
}
