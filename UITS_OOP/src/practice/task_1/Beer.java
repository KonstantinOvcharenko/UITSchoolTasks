package practice.task_1;

public abstract class Beer {
	private String name;
	private int price;

	public Beer() {
	}

	public Beer(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Пиво " + name + ", цена " + price+" грн";
	}
}
