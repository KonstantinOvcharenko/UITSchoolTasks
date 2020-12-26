package practice.task_0_1.flowers.flower;

import java.util.Random;

public class Rose extends Flower {
	private static Random rand;
	static {
		rand = new Random(System.currentTimeMillis());
	}

	public Rose(int freshness, int stemlength, int price) {
		super(freshness, stemlength, price);
	}

	public Rose() {
		super(createRose());
	}

	private static int[] createRose() {
		int[] args = new int[3];
		args[0] = rand.nextInt(11);
		args[1] = rand.nextInt(56) + 25;
		args[2] = args[1] + 10 - args[0] * 3;
		return args;
	}

	@Override
	public String toString() {
		return "–оза, свежесть " + getFreshness() + " д, длина стебл€ " + getStemlength() +  "см, цена " + getPrice()
				+ " грн";
	}
}
