package practice.task_0_1.flowers.flower;

import java.util.Random;

public class Tulip extends Flower {
	private static Random rand;
	static {
		rand = new Random(System.currentTimeMillis());
	}

	public Tulip(int freshness, int stemlength, int price) {
		super(freshness, stemlength, price);
	}

	public Tulip() {
		super(createTulip());
	}

	private static int[] createTulip() {
		int[] args = new int[3];
		args[0] = rand.nextInt(11);
		args[1] = rand.nextInt(41) + 10;
		args[2] = args[1] + 5 - args[0];
		return args;
	}

	@Override
	public String toString() {
		return "“юльпан, свежесть " + getFreshness() + " д, длина стебл€ " + getStemlength() + " см, цена " + getPrice()
				+ " грн";
	}
}
