package practice.task_0_1.chief;

import practice.task_0_1.chief.vegetables.*;

public class Salade {
	private Vegetable[] salade;
	private double total_Kkal = 0;

	public Salade() {
		salade = new Vegetable[0];
	}

	public void addVegetable(Vegetable v) {
		Vegetable[] tmp = new Vegetable[salade.length + 1];
		System.arraycopy(salade, 0, tmp, 0, salade.length);
		tmp[tmp.length - 1] = v;
		salade = tmp;
		total_Kkal += v.getKkal();
	}

	public void addVegetables(String name, int amount) {
		switch (name) {
		case "Помидор":
			for (int i = 0; i < amount; i++)
				addVegetable(new Tomato());
			break;
		case "Огурец":
			for (int i = 0; i < amount; i++)
				addVegetable(new Cucumber());
			break;
		case "Лук":
			for (int i = 0; i < amount; i++)
				addVegetable(new Onion());
			break;
		case "Перец":
			for (int i = 0; i < amount; i++)
				addVegetable(new Pepper());
			break;
		default:
			System.out.println("Не выбраны овощи для добавления.");
		}
	}

	public void sortByKalories() {
		for (int k = 1; k < salade.length; k++) {
			Vegetable newElem = salade[k];
			int location = k - 1;
			while (location >= 0 && salade[location].getKkal() > newElem.getKkal()) {
				salade[location + 1] = salade[location];
				location--;
			}
			salade[location + 1] = newElem;
		}
	}

	public void finByKalories(int min_kkal, int max_kkal) {
		System.out.println("Овощи с калорийностью от " + min_kkal + " до " + max_kkal + " кКал:");
		for (Vegetable v : salade) {
			if (v.getKkal() > min_kkal && v.getKkal() < max_kkal) {
				System.out.println(v.toString());
			}
		}
	}

	public void showSalade() {
		System.out.println("Ваш салат: ");
		for (Vegetable v : salade)
			System.out.println(v.toString());
		System.out.println();
	}

	public int amount(int n) {
		int a = 0;
		switch (n) {
		case 1:
			for (Vegetable v : salade) {
				if (v.getClass() == Tomato.class)
					a++;
			}
			break;
		case 2:
			for (Vegetable v : salade) {
				if (v.getClass() == Cucumber.class)
					a++;
			}
			break;
		case 3:
			for (Vegetable v : salade) {
				if (v.getClass() == Onion.class)
					a++;
			}
			break;
		case 4:
			for (Vegetable v : salade) {
				if (v.getClass() == Pepper.class)
					a++;
			}
			break;
		}
		return a;
	}
}
