package practice.task_0_1.taxi;

import practice.task_0_1.taxi.cars.TaxiCar;

public class Autopark {
	private TaxiCar[] cars;
	private int total_cost;

	public Autopark() {
		cars = new TaxiCar[0];
		total_cost = 0;
	}

	public void addCar(TaxiCar car) {
		TaxiCar[] tmp = new TaxiCar[cars.length + 1];
		System.arraycopy(cars, 0, tmp, 0, cars.length);
		tmp[tmp.length - 1] = car;
		cars = tmp;
		total_cost += car.getCost();
	}

	public void showTotalCost() {
		System.out.println("������ ��������� ���������: " + total_cost + " ���");
	}

	public void sorByFuelConsumption() {
		for (int k = 1; k < cars.length; k++) {
			int location = k - 1;
			TaxiCar newCar = cars[k];
			while (location >= 0 && cars[location].getFuelConsuption() > newCar.getFuelConsuption()) {
				cars[location + 1] = cars[location];
				location--;
			}
			cars[location + 1] = newCar;
		}
	}

	public void carBySpeed(int min_speed, int max_speed) {
		System.out.println("���������� �� ��������� ����. �������� � ��������� �� " + min_speed + "��/� �� " + max_speed
				+ "��/�:");
		for (TaxiCar c : cars) {
			if (c.getTopSpeed() > min_speed && c.getTopSpeed() < max_speed) {
				System.out.println(c.toString());
				return;
			}
		}
	}

	public void showAutopark() {
		System.out.println("������ ����� � ���������: ");
		for (TaxiCar c : cars)
			System.out.println(c.toString());

	}
}
