package examples.NestedInner;

public class Test {
	public String testfield = "(testfield)";

	public static class Mynested {
		public String nested = "(nested)";

		public void nestedshow() {
			System.out.println("������, � ���������!" + nested);
		}
	}

	public class MyInner {
		public String inner = "(inner!)";

		public void innershow() {
			System.out.println("������ � ���������� ����� !" + inner);
		}
	}

	public void show() {
		System.out.println("������ � ������ �����!" + testfield);
	}
}
