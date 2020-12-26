package practice.task_0_1.chief.vegetables;

import java.util.Random;

public class Pepper extends Vegetable {
	private static Random rand = new Random(System.currentTimeMillis());

	public Pepper(double kal, double price, double mass, double freshness) {
		super(kal, price, mass, freshness);
	}

	public Pepper() {
		super(createPepper());
	}

	private static double[] createPepper() {
		double[] args = new double[4];
		args[2] = rand.nextDouble() * 61 + 80;// mass
		args[0] = (args[2] * 0.251) / 100;// kalories
		args[3] = rand.nextInt(10) + 1;// freshness
		args[1] = (args[2] - args[0] - args[3]) * 0.055;// price
		return args;
	}

	@Override
	public String toString() {
		return "Перец, масса " + (float) getMass() + "г, калорийность " + (float) getKkal() + " кал, свежесть "
				+ (float) getFreshness() + " дней, цена " + (float) getPrice() + " грн.";
	}
}
