package practice.task_0.planes;

public class Plane {
	private String destination;
	private int flight;
	private String type;
	private String time;
	private String day;

	public Plane(String destination, int flight, String type, String time, String day) {
		this.destination = destination;
		this.flight = flight;
		this.type = type;
		this.time = time;
		this.day = day;
	}

	public Plane(String destination, int flight, String time, String day) {
		this.destination = destination;
		this.flight = flight;
		this.time = time;
		this.day = day;
	}

	public Plane() {
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public int getFlight() {
		return flight;
	}

	public void setFlight(int flight) {
		this.flight = flight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return destination + " " + flight + " " + type + " " + time + " " + day;
	}

}
