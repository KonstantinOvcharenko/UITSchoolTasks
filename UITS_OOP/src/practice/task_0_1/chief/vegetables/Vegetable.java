package practice.task_0_1.chief.vegetables;

public abstract class Vegetable {
	private double kkal;
	private double price;
	private double mass;
	private double freshness;

	public Vegetable() {
	}

	public Vegetable(double kkal, double price, double mass, double freshness) {
		this.kkal = kkal;
		this.price = price;
		this.mass = mass;
		this.freshness = freshness;
	}

	public Vegetable(double... params) {
		kkal = params[0];
		price = params[1];
		mass = params[2];
		freshness = params[3];
	}

	public double getKkal() {
		return kkal;
	}

	public double getPrice() {
		return price;
	}

	public double getMass() {
		return mass;
	}

	public double getFreshness() {
		return freshness;
	}
}
