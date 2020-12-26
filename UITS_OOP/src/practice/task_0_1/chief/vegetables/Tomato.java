package practice.task_0_1.chief.vegetables;

import java.util.Random;

public class Tomato extends Vegetable {
	private static Random rand = new Random(System.currentTimeMillis());

	public Tomato(double kkal, double price, double mass, double freshness) {
		super(kkal, price, mass, freshness);
	}

	public Tomato() {
		super(createTomato());
	}

	private static double[] createTomato() {
		double[] args = new double[4];
		args[2] = rand.nextDouble() * 101 + 25;// mass
		args[0] = (args[2] * 24) / 100;// kalories
		args[3] = rand.nextInt(10) + 1;// freshness
		args[1] = (args[2] - args[0] - args[3]) * 0.05;// price
		return args;
	}

	@Override
	public String toString() {
		return "Помидор, масса " + (float) getMass() + "г, калорийность " + (float) getKkal() + " кКал, свежесть "
				+ (float) getFreshness() + " дней, цена " + (float) getPrice() + " грн.";
	}
}
