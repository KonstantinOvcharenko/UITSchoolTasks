package practice.task_0_1.taxi.cars;

public abstract class TaxiCar {
	private String mark;
	private String type;
	private String model;
	private int cost;
	private int topSpeed;
	private int fuelConsuption;

	public TaxiCar(String mark, String type, String model, int cost, int topSpeed, int fuelConsumption) {
		this.mark = mark;
		this.type = type;
		this.model = model;
		this.cost = cost;
		this.topSpeed = topSpeed;
		this.fuelConsuption = fuelConsumption;
	}

	public String getMark() {
		return mark;
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	public int getCost() {
		return cost;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public int getFuelConsuption() {
		return fuelConsuption;
	}

	@Override
	public String toString() {
		return "Автомобиль " + mark + ", тип " + type + ", модель " + model + ", стоимость " + cost + " грн, скорость"
				+ topSpeed + " км/ч, потребление топлива " + fuelConsuption + " л/100 км.";
	}

}
