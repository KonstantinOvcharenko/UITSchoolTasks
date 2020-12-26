package examples;

public interface MyInterface {
	int b = 10;

	enum Enum_in_interface {
		A, B, C
	};

	static void static_method_in_interface() {
		System.out.println("Hi from static method!");
	}

	default void default_method_in_interface() {
		System.out.println("Hi from default method!");
	}

	class Class_in_interface {
		public void print() {
			System.out.println("Hi from inner class!");
		}
	}

	interface Interface_in_interface {
	}
}
