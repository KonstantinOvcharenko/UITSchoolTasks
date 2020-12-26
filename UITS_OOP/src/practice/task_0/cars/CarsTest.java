package practice.task_0.cars;

public class CarsTest {
	public static void main(String[] args) {
		Car car1 = new Car(0, "Toyota", "Rav-4", 2012, "Grey", 12000, 5437);
		Car car2 = new Car(1, "Hyundai", "Accent", 2014, "White", 12500, 5799);
		Car car3 = new Car(2, "Mercedes", "G-63", 2018, "Black", 110000, 7777);
		Car car4 = new Car(3, "Toyota", "Rav-4", 2013, "Grey", 14000, 1609);
		Car car5 = new Car(4, "BMW", "M5", 2018, "Blue", 95000, 9898);
		CarShop shop = new CarShop();
		shop.addCar(car1);
		shop.addCar(car2);
		shop.addCar(car3);
		shop.addCar(car4);
		shop.addCar(car5);
		shop.showCars();
		shop.markList("Mercedes");
		shop.expluatation("Rav-4", 2);
		shop.carsbyPrice(2018, 70000);
	}
}
