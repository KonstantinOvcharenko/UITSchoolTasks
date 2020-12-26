package practice.task_0_1.chief;

import java.util.Scanner;
import practice.task_0_1.chief.vegetables.*;

public class Chief {
	public static void main(String[] args) {
		System.out.println("����� ���������� � ��� ��������! ���������� ������� ���� �����:");
		Scanner scan = new Scanner(System.in);
		Salade salade = new Salade();
		int choice = 0;
		do {
			System.out.println("����� ����� �� ������ �� �������� � ���� �����?");
			System.out.println("1 �������� (��������� " + salade.amount(1) + ")");
			System.out.println("2 ������ (��������� " + salade.amount(2) + ")");
			System.out.println("3 ��� (��������� " + salade.amount(3) + ")");
			System.out.println("4 ����� (��������� " + salade.amount(4) + ")");
			System.out.println("5 ������� �����");
			System.out.println("��� �����: ");
			choice = Integer.parseInt(scan.next());
			switch (choice) {
			case 1:
				System.out.println("������� ��������� �� ������ ��������? ");
				salade.addVegetables("�������", Integer.parseInt(scan.next()));
				break;
			case 2:
				System.out.println("������� ������� �� ������ ��������? ");
				salade.addVegetables("������", Integer.parseInt(scan.next()));
				break;
			case 3:
				System.out.println("������� ���� �� ������ ��������? ");
				salade.addVegetables("���", Integer.parseInt(scan.next()));
				break;
			case 4:
				System.out.println("������� ������ �� ������ ��������? ");
				salade.addVegetables("�����", Integer.parseInt(scan.next()));
				break;
			}
		} while ((choice > 0 & choice < 6) & choice != 5);
		scan.close();

		salade.sortByKalories();
		salade.showSalade();
		salade.finByKalories(20, 40);
	}
}
