package practice.task_0_1.taxi;

import practice.task_0_1.taxi.cars.*;

public class TaxiPark {
	public static void main(String[] args) {
		Sedan sedan = new Sedan("Hyundai", "Accent", 230000, 210, 10);
		Hatchback hatchback = new Hatchback("Nissan", "Note", 350000, 190, 8);
		Universal universal = new Universal("Renault", "Logan MCV", 320000, 200, 6);
		Autopark autopark = new Autopark();
		autopark.addCar(sedan);
		autopark.addCar(hatchback);
		autopark.addCar(universal);
		autopark.showTotalCost();
		autopark.sorByFuelConsumption();
		autopark.showAutopark();
		autopark.carBySpeed(187, 198);
	}
}
