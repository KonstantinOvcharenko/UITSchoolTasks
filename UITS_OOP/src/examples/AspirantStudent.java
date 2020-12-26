package examples;

public class AspirantStudent {
	public static void main(String[] args) {
		Student student = new Student("Жорик Пупкин", 19);
		System.out.println(student);
		Aspirant aspirant = new Aspirant("Жека Гренкин", 24, "Исследование миграции бобров за водкой");
		System.out.println(aspirant);
	}
}
