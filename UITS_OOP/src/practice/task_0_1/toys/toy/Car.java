package practice.task_0_1.toys.toy;

public class Car extends Toy {
	public Car(String type, String size, int age, int price) {
		super(type, size, age, price);
	}

	@Override
	public String toString() {
		return "Игрушка " + getType() + ", размер - " + getSize() + ", возраст - " + getAge() + "+, цена - "
				+ getPrice() + "грн.";
	}
}
