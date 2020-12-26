package practice.task_0_1.airplanes;

import practice.task_0_1.airplanes.planes.*;

public class Hangar {
	private Airplane[] planes;
	private int total_capacity;
	private int total_lifting_capactiy;

	public Hangar() {
		planes = new Airplane[0];
		total_capacity = 0;
		total_lifting_capactiy = 0;
	}

	public void addPlane(Airplane plane) {
		Airplane[] newPlanes = new Airplane[planes.length + 1];
		System.arraycopy(planes, 0, newPlanes, 0, planes.length);
		newPlanes[newPlanes.length - 1] = plane;
		planes = newPlanes;
		total_capacity += plane.getCapacity();
		total_lifting_capactiy += plane.getLifting_capacity();
	}

	public void sortByDistance() {
		System.out.println("Самолеты по возрастанию дальности полета: ");
		for (int i = 1; i < planes.length; i++) {
			Airplane newPlane = planes[i];
			int location = i - 1;
			while (location >= 0 && planes[location].getFlight_distance() > newPlane.getFlight_distance()) {
				planes[location + 1] = planes[location];
				location--;
			}
			planes[location + 1] = newPlane;
		}
	}

	public void findByConsumption(int min, int max) {
		System.out.println("Самолеты с часовым расходом топлива от " + min + " кг/час до " + max + " кг/час :");
		for (Airplane p : planes) {
			if (p.getFuel_consumption() > min & p.getFuel_consumption() < max)
				System.out.println(p.getModel() + ", часовый расход топлива " + p.getFuel_consumption() + " кг/час");
		}
	}

	public void showHangar() {
		for (Airplane p : planes) {
			System.out.println(p.toString());
		}
	}

	public void total_capacity() {
		System.out.println(
				"Общая вместимость и грузоподъемность: " + total_capacity + " чел, " + total_lifting_capactiy + " кг");
	}

}
