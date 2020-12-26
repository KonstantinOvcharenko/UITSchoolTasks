package practice.task_0_1.toys.toy;

public abstract class Toy {
	private int price;
	private String size;
	private String type;
	private int age;

	public Toy(String type, String size, int age, int price) {
		this.type = type;
		this.size = size;
		this.age = age;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public int getAge() {
		return age;
	}

}
