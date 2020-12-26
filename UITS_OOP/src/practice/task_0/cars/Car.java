package practice.task_0.cars;

public class Car {
	private int id;
	private String mark;
	private String model;
	private int year;
	private int price;
	private String color;
	private int number;

	public Car(int id, String mark, String model, int year, String color, int price, int number) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.number = number;
	}

	public Car() {

	}

	public Car(int id, String mark, String model, int year) {
		this.id = id;
		this.mark = mark;
		this.model = model;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "[" + id + "]" + " " + mark + " " + model + " " + year + " " + color + " " + price + "$ " + number;
	}

}
