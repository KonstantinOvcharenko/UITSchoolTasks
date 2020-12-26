package practice.task_2;

import java.util.Random;
import java.util.Scanner;

public class Woman extends Human {
	private Random rand = new Random(System.currentTimeMillis());

	public Woman(String first_name, String last_name, float height, float weight) {
		super(false, first_name, last_name, height, weight);
	}

	@Override
	public boolean speak(Human human) {
		System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " �������������.");
		if (human.getSex() == false & this.getSex() == false) {
			System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������.");
			return true;
		}
		if ((human.getSex() == false & this.getSex() == true) || (human.getSex() == true & this.getSex() == false)) {
			System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������.");
			return true;
		}

		if (human.getSex() == true & this.getSex() == true) {
			int r = rand.nextInt(100);
			if (r < 50) {
				System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������.");
				return true;
			} else if (r < 100) {
				System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������� ��������.");
				return false;
			}
		}

		return false;
	}

	@Override
	public boolean stand(Human human) {
		double r = rand.nextDouble();
		if (human.getSex() == false & this.getSex() == false) {
			if (r < 0.05) {
				System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������� ���� �����.");
				return true;
			}
			System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ������� ���� ����� �� �����.");
			return false;
		}
		if ((human.getSex() == false & this.getSex() == true) || (human.getSex() == true & this.getSex() == false)) {
			if (r < 0.7) {
				System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������� ���� �����.");
				return true;
			}
			System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ������� ���� ����� �� �����.");
			return false;
		}

		if (human.getSex() == true & this.getSex() == true) {
			if (r < 0.056) {
				System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ��������� ���� �����.");
				return true;
			}
			System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ������� ���� ����� �� �����.");
			return false;

		}

		return false;
	}

	@Override
	public boolean spendTime(Human human) {
		if (human.getHeight() < this.getHeight()) {
			float difference = 100 - (human.getHeight() / this.getHeight()) * 100;
			double r = rand.nextDouble();
			if (difference > 10) {
				if (r < 0.85) {
					System.out
							.println(this.getFirst_name() + " � " + human.getFirst_name() + " �������� ������ �����.");
					return true;
				}
			} else if (difference < 10) {
				if (r < 0.95) {
					System.out
							.println(this.getFirst_name() + " � " + human.getFirst_name() + " �������� ������ �����.");
					return true;
				}
			}
		}

		if (human.getHeight() > this.getHeight()) {
			float difference = 100 - (this.getHeight() / human.getHeight()) * 100;
			double r = rand.nextDouble();
			if (difference > 10) {
				if (r < 0.85) {
					System.out
							.println(this.getFirst_name() + " � " + human.getFirst_name() + " �������� ������ �����.");
					return true;
				}
			} else if (difference < 10) {
				if (r < 0.95) {
					System.out
							.println(this.getFirst_name() + " � " + human.getFirst_name() + " �������� ������ �����.");
					return true;
				}
			}
		}
		System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " �� ����� ��������� ����� ������.");
		return false;
	}

	public Human giveBirth(Human h) {
		Human child;
		Scanner scan = new Scanner(System.in);
		double r = rand.nextDouble();
		if (this.getSex() != h.getSex()) {
			if (r < 0.5) {
				System.out.println(
						this.getFirst_name() + " � " + h.getFirst_name() + " ���� ��������, ��� �������? ");
				String n = scan.next();
				//scan.close();
				child = new Man(n, h.getLast_name(), h.getHeight() + 0.1f * (this.getHeight() - h.getHeight()),
						h.getWeight() + 0.1f * (this.getWeight() - h.getWeight()));
				System.out.println("� " + this.getFirst_name() + " � " + h.getFirst_name() + " ������� ������� "
						+ child.toString());
				return child;
			} else if (r < 1.0) {
				System.out.println(
						this.getFirst_name() + " � " + h.getFirst_name() + " ���� �������, ��� �������? ");
				String n = scan.next();
				//scan.close();
				child = new Woman(n, h.getLast_name(), this.getHeight() + 0.1f * (h.getHeight() - this.getHeight()),
						this.getWeight() + 0.1f * (h.getWeight() - this.getWeight()));
				System.out.println("� " + this.getFirst_name() + " � " + h.getFirst_name() + " �������� ������� "
						+ child.toString());
				return child;
			}
		}
		scan.close();
		return null;
	}

	@Override
	public Human haveRelations(Human human) {
		if (speak(human) == true && stand(human) == true && spendTime(human) == true) {
			if (human.getSex() != this.getSex()) {
				System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ������� ���������.");
				return giveBirth(human);
			} else
				System.out.println("���������� ������ �������!");
		}
		System.out.println(this.getFirst_name() + " � " + human.getFirst_name() + " ����������.");
		return null;
	}
}
