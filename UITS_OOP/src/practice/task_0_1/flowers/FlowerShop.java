package practice.task_0_1.flowers;

import java.util.Scanner;

public class FlowerShop {
	public static void main(String[] args) {
		Bucket bucket = new Bucket();
		System.out.println("��� ������������ ��������� ������� \"fLover\"!\n����� ����� �� ������� �������� � �����?");
		Scanner scan = new Scanner(System.in);
		int n;
		int roses;
		int chrisanthemes;
		int tulips;
		do {
			System.out.println("1 - ����");
			System.out.println("2 - ��������");
			System.out.println("3 - ����������");
			System.out.print("��� �����:");
			n = Integer.parseInt(scan.next());
		} while (n < 1 | n > 3);
		switch (n) {
		case 1:
			System.out.print("�� ������� ����, ������� ��� �� ������ ��������?:");
			roses = Integer.parseInt(scan.next());
			bucket.addFlowers("rose", roses);
			break;
		case 2:
			System.out.print("�� ������� ��������, ������� ��������� �� ������ ��������?:");
			tulips = Integer.parseInt(scan.next());
			bucket.addFlowers("tulip", tulips);
			break;
		case 3:
			System.out.print("�� ������� ����������, ������� ��������� �� ������ ��������?:");
			chrisanthemes = Integer.parseInt(scan.next());
			bucket.addFlowers("chrisanthema", chrisanthemes);
			break;
		}
		bucket.sortByFreshness();
		bucket.showBucket();
		System.out.println("�������� ���������� ��� ������: ");
		int p;
		System.out.println("1 - ������� �� ������ 15 ���");
		System.out.println("2 - ��������� ������ 10 ���");
		System.out.println("3 - ���. ��������� 20 ���");
		System.out.println("4 - ����������� �����");
		System.out.println("��� �����:");
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
		System.out.println("��������� ��������� ������: " + bucket.getCost() + " ���");
		bucket.findByStemLength(30, 50);
	}
}