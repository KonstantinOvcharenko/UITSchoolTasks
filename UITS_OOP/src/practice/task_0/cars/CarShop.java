package practice.task_0.cars;

import java.util.Arrays;

public class CarShop {
	private Car[] CarList;

	public CarShop() {
		CarList = new Car[0];
	}

	public void addCar(Car car) {
		Car[] newList = new Car[CarList.length + 1];
		System.arraycopy(CarList, 0, newList, 0, CarList.length);
		newList[newList.length - 1] = car;
		CarList = newList;
	}

	public void deleteCar(int id) {
		if (id < CarList.length - 1)
			System.arraycopy(CarList, id + 1, CarList, id, CarList.length - 1 - id);
		CarList = Arrays.copyOf(CarList, CarList.length - 1);
	}

	public void showCars() {
		System.out.println("Cars in the shop:");
		for (Car c : CarList)
			System.out.println(c.toString());
	}

	public void markList(String m) {
		System.out.println("Cars of mark " + "\"" + m + "\" :");
		for (Car c : CarList) {
			if (c.getMark().equals(m))
				System.out.println(c.toString());
		}
	}

	public void expluatation(String model, int years) {
		System.out.println("Cars with expluatation term more than " + years + " years:");
		for (Car c : CarList) {
			if (c.getModel().equals(model) & (2019 - c.getYear()) > years)
				System.out.println(c.toString());
		}
	}

	public void carsbyPrice(int year, int price) {
		System.out.println("Cars of " + year + " year with price more than " + price + ":");
		for (Car c : CarList) {
			if (c.getYear() == year & c.getPrice() > price)
				System.out.println(c.toString());
		}
	}
}
