package practice.task_0_1.airplanes.planes;

public abstract class Airplane {
	private String model;
	private int capacity;
	private int lifting_capacity;
	private int flight_distance;
	private int fuel_consumption;

	public Airplane(String model, int capacity, int lifting_capacity, int flight_distance, int fuel_consumption) {
		this.model = model;
		this.capacity = capacity;
		this.lifting_capacity = lifting_capacity;
		this.flight_distance = flight_distance;
		this.fuel_consumption = fuel_consumption;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getLifting_capacity() {
		return lifting_capacity;
	}

	public int getFlight_distance() {
		return flight_distance;
	}

	public int getFuel_consumption() {
		return fuel_consumption;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return model + ", вместимость " + capacity + "чел., грузоподъемность " + lifting_capacity
				+ " кг, max дистанция полета " + flight_distance + " км, часовый расход топлива " + fuel_consumption
				+ " кг/час";
	}
}
