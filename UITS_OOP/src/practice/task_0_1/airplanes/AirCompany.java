package practice.task_0_1.airplanes;

import practice.task_0_1.airplanes.planes.*;

public class AirCompany {
	public static void main(String[] args) {
		Hangar hangar = new Hangar();
		hangar.addPlane(new Cessna("Cessna 172", 4, 1111, 1289, 900));
		hangar.addPlane(new Boeing("Boeing 747-8", 581, 442000, 14815, 14500));
		hangar.addPlane(new Airbus("Airbus 380", 525, 560000, 15400, 15000));
		hangar.sortByDistance();
		hangar.showHangar();
		System.out.println();
		hangar.total_capacity();
		System.out.println();
		hangar.findByConsumption(13000, 16000);
	}
}
