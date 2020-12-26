package practice.task_0_1.flowers;

import java.util.Scanner;

public class FlowerShop {
	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		System.out.println("Вас приветствует цветочный магазин \"fLover\"!\nКакие цветы Вы желаете добавить в букет?");
		Scanner scan = new Scanner(System.in);
		int n;
		int roses;
		int chrisanthemes;
		int tulips;
		do {
			System.out.println("1 - Розы");
			System.out.println("2 - Тюльпаны");
			System.out.println("3 - Хризантемы");
			System.out.print("Ваш выбор:");
			n = Integer.parseInt(scan.next());
		} while (n < 1 | n > 3);
		switch (n) {
		case 1:
			System.out.print("Вы выбрали розы, сколько роз Вы хотите добавить?:");
			roses = Integer.parseInt(scan.next());
			bucket.addFlowers("rose", roses);
			break;
		case 2:
			System.out.print("Вы выбрали тюльпаны, сколько тюльпанов Вы хотите добавить?:");
			tulips = Integer.parseInt(scan.next());
			bucket.addFlowers("tulip", tulips);
			break;
		case 3:
			System.out.print("Вы выбрали хризантемы, сколько хризантем Вы хотите добавить?:");
			chrisanthemes = Integer.parseInt(scan.next());
			bucket.addFlowers("chrisanthema", chrisanthemes);
			break;
		}
		bucket.sortByFreshness();
		bucket.showBucket();
		System.out.println("Выберите аксессуары для букета: ");
		int p;
		System.out.println("1 - Обертка из пленки 15 грн");
		System.out.println("2 - Перевязка лентой 10 грн");
		System.out.println("3 - Доп. украшения 20 грн");
		System.out.println("4 - Подтвердить выбор");
		System.out.println("Ваш выбор:");
		do {
			p = Integer.parseInt(scan.next());
			switch (p) {
			case 1:
				bucket.setCost(bucket.getCost() + 15);
				break;
			case 2:
				bucket.setCost(bucket.getCost() + 10);
				break;
			case 3:
				bucket.setCost(bucket.getCost() + 20);
				break;
			case 4:
				break;
			}
		} while (p != 4);
		scan.close();
		System.out.println("Финальная стоимость букета: " + bucket.getCost() + " грн");
		bucket.findByStemLength(30, 50);
	}
}