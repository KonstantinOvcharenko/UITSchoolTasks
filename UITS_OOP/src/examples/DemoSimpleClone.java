package examples;

public class DemoSimpleClone {
	private static void changeAge(Student p) {
		p = (Student) p.clone();
		p.setAge(45);
		System.out.println("age= " + p.getAge());
	}

	public static void main(String[] args) {
		Student student = new Student("Vasya", 20);
		System.out.println("age= " + student.getAge());
		changeAge(student);
		System.out.println("age= " + student.getAge());
	}
}
