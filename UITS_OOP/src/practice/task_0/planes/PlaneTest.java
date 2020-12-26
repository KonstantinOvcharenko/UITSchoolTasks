package practice.task_0.planes;

public class PlaneTest {
	public static void main(String[] args) {
		Airline airline = new Airline();
		Plane plane1 = new Plane("Kyiv", 243, "Boeing-735", "13:10", "Friday");
		Plane plane2 = new Plane("Kharkiv", 243, "Tu-134", "11:35", "Tuesday");
		Plane plane3 = new Plane("Berlin", 243, "Boeing-740", "15:20", "Monday");
		Plane plane4 = new Plane("New York", 243, "Boeing-747", "17:25", "Monday");
		airline.addPlane(plane1);
		airline.addPlane(plane2);
		airline.addPlane(plane3);
		airline.addPlane(plane4);
		airline.showPlanes();
		airline.getFlights("Kharkiv");
		airline.flightsbyDay("Monday");
		airline.flightsbyTime("Monday", "13:30");
	}
}
