package practice.task_0_1.chief.vegetables;

import java.util.Random;

public class Onion extends Vegetable {
	private static Random rand = new Random(System.currentTimeMillis());

	public Onion(double kkal, double price, double mass, double freshness) {
		super(kkal, price, mass, freshness);
	}

	public Onion() {
		super(createOnion());
	}

	private static double[] createOnion() {
		double[] args = new double[4];
		args[2] = rand.nextDouble() * 31 + 70;// mass
		args[0] = (args[2] * 47) / 100;// kalories
		args[3] = rand.nextInt(10) + 1;// freshness
		args[1] = (args[2] - args[0] - args[3]) * 0.03;// price
		return args;
	}

	@Override
	public String toString() {
		return "Ћук, масса " + (float) getMass() + "г, калорийность " + (float) getKkal() + " к ал, свежесть "
				+ (float) getFreshness() + " дней, цена " + (float) getPrice() + " грн.";
	}
}
