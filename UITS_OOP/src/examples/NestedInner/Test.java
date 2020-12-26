package examples.NestedInner;

public class Test {
	public String testfield = "(testfield)";

	public static class Mynested {
		public String nested = "(nested)";

		public void nestedshow() {
			System.out.println("Привет, я вложенный!" + nested);
		}
	}

	public class MyInner {
		public String inner = "(inner!)";

		public void innershow() {
			System.out.println("Привет я внутренний класс !" + inner);
		}
	}

	public void show() {
		System.out.println("Привет я просто класс!" + testfield);
	}
}
