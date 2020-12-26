package practice.task_2;

public class Compatibility {
	public static Human compatibility_test(Human h1, Human h2) {
		return h1.haveRelations(h2);
	}

	public static void main(String[] args) {
		Man man1 = new Man("Петя", "Соловьев", 185, 75);
		Man man2 = new Man("Гена", "Семенов", 185, 75);
		Woman woman1 = new Woman("Аня", "Коровьева", 164, 55);
		Woman woman2 = new Woman("Лера", "Петухова", 164, 55);
		Compatibility.compatibility_test(man1, woman1);
		System.out.println();
		Compatibility.compatibility_test(man1, man2);
		System.out.println();
		Compatibility.compatibility_test(woman1, woman2);
		System.out.println();
		Compatibility.compatibility_test(man1, woman2);
	}
}
