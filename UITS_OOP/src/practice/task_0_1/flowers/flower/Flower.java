package practice.task_0_1.flowers.flower;

public abstract class Flower {
	private int freshness;
	private int stemlength;
	private int price;

	public Flower(int freshness, int stemlength, int price) {
		this.freshness = freshness;
		this.stemlength = stemlength;
		this.price = price;
	}

	public Flower(int... args) {
		freshness = args[0];
		stemlength = args[1];
		price = args[2];
	}

	public int getFreshness() {
		return freshness;
	}

	public int getStemlength() {
		return stemlength;
	}

	public int getPrice() {
		return price;
	}
}
