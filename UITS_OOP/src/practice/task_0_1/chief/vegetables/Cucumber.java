package practice.task_0_1.chief.vegetables;

import java.util.Random;

public class Cucumber extends Vegetable {
	private static Random rand = new Random(System.currentTimeMillis());

	public Cucumber(double kkal, double price, double mass, double freshness) {
		super(kkal, price, mass, freshness);
	}

	public Cucumber() {
		super(createCucumber());
	}

	private static double[] createCucumber() {
		double[] args = new double[4];
		args[2] = rand.nextDouble() * 111 + 70;// mass
		args[0] = (args[2] * 18) / 132;// kalories
		args[3] = rand.nextInt(10) + 1;// freshness
		args[1] = (args[2] - args[0] - args[3]) * 0.04;// price
		return args;
	}

	@Override
	public String toString() {
		return "ќгурец, масса " + (float) getMass() + "г, калорийность " + (float) getKkal() + " к ал, свежесть "
				+ (float) getFreshness() + " дней, цена " + (float) getPrice() + " грн.";
	}
}
