package practice.task_0_1.chief;

import java.util.Scanner;
import practice.task_0_1.chief.vegetables.*;

public class Chief {
	public static void main(String[] args) {
		System.out.println("Добро пожаловать в наш ресторан! Предлагаем собрать свой салат:");
		Scanner scan = new Scanner(System.in);
		Salade salade = new Salade();
		int choice = 0;
		do {
			System.out.println("Какие овощи Вы хотелы бы добавить в свой салат?");
			System.out.println("1 Помидоры (Добавлено " + salade.amount(1) + ")");
			System.out.println("2 Огурцы (Добавлено " + salade.amount(2) + ")");
			System.out.println("3 Лук (Добавлено " + salade.amount(3) + ")");
			System.out.println("4 Перец (Добавлено " + salade.amount(4) + ")");
			System.out.println("5 Собрать салат");
			System.out.println("Ваш выбор: ");
			choice = Integer.parseInt(scan.next());
			switch (choice) {
			case 1:
				System.out.println("Сколько помидоров Вы хотите добавить? ");
				salade.addVegetables("Помидор", Integer.parseInt(scan.next()));
				break;
			case 2:
				System.out.println("Сколько огурцов Вы хотите добавить? ");
				salade.addVegetables("Огурец", Integer.parseInt(scan.next()));
				break;
			case 3:
				System.out.println("Сколько лука Вы хотите добавить? ");
				salade.addVegetables("Лук", Integer.parseInt(scan.next()));
				break;
			case 4:
				System.out.println("Сколько перцев Вы хотите добавить? ");
				salade.addVegetables("Перец", Integer.parseInt(scan.next()));
				break;
			}
		} while ((choice > 0 & choice < 6) & choice != 5);
		scan.close();

		salade.sortByKalories();
		salade.showSalade();
		salade.finByKalories(20, 40);
	}
}
