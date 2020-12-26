package practice.task_0_1.flowers.flower;

import java.util.Random;

public class Chrisanthema extends Flower {
	private static Random rand;
	static {
		rand = new Random(System.currentTimeMillis());
	}

	public Chrisanthema(int freshness, int stemlength, int price) {
		super(freshness, stemlength, price);
	}

	public Chrisanthema() {
		super(createChrisanthema());
	}

	private static int[] createChrisanthema() {
		int[] args = new int[3];
		args[0] = rand.nextInt(11);
		args[1] = rand.nextInt(61) + 10;
		args[2] = args[1] + 5 - args[0] * 2;
		return args;
	}

	@Override
	public String toString() {
		return "Хризантема, свежесть " + getFreshness() + " д, длина стебля " + getStemlength() + " см, цена "
				+ getPrice() + " грн";
	}
}
