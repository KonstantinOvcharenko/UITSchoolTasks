package practice.task_1;

public class Bud extends Beer {
	private String type;
	private int alcohol;
	static double totalCost;
	static double totalAmount;

	public Bud(String name, int price, String type, int alcohol) {
		super(name, price);
		this.type = type;
		this.alcohol = alcohol;
	}

	public Bud() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(int alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		return super.toString() + ", тип " + type + ", кол-во оборотов " + alcohol + "%";
	}

	public static double avPrice() {
		return totalCost / totalAmount;
	}
}
