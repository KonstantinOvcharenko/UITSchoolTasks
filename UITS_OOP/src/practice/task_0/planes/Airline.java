package practice.task_0.planes;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Airline {
	private Plane[] planes;

	public Airline() {
		planes = new Plane[0];
	}

	public void addPlane(Plane plane) {
		Plane[] newplanes = new Plane[planes.length + 1];
		System.arraycopy(planes, 0, newplanes, 0, planes.length);
		newplanes[newplanes.length - 1] = plane;
		planes = newplanes;
	}

	public void removeApp(int flight) {
		for (int i = 0; i < planes.length; i++) {
			if (planes[i].getFlight() == flight) {
				if (i < planes.length - 1) {
					System.arraycopy(planes, i + 1, planes, i, planes.length - 1 - i);
				}
				Arrays.copyOf(planes, planes.length - 1);
				break;
			}
		}
	}

	public void showPlanes() {
		System.out.println("***List of all planes: ");
		for (Plane p : planes) {
			System.out.println(p.toString());
		}
	}

	public void getFlights(String destination) {
		System.out.println("***Flights with destination " + destination + ":");
		for (Plane p : planes) {
			if (p.getDestination().equals(destination))
				System.out.println(p.toString());
		}
	}

	public void flightsbyDay(String day) {
		System.out.println("***Flights by day of departure " + day + ":");
		for (Plane p : planes) {
			if (p.getDay().equals(day))
				System.out.println(p.toString());
		}
	}

	public void flightsbyTime(String day, String time) {
		System.out.println("***Planes with departure time after " + time + ":");
		Pattern p1 = Pattern.compile("(\\d{2}):(\\d{2})");
		Matcher m1 = p1.matcher(time);
		int hour1 = 0;
		int minute1 = 0;
		if (m1.matches()) {
			String hourstr = m1.group(1);
			String minutestr = m1.group(2);
			hour1 = Integer.parseInt(hourstr);
			minute1 = Integer.parseInt(minutestr);
		}
		for (Plane p : planes) {
			Pattern p2 = Pattern.compile("(\\d{2}):(\\d{2})");
			Matcher m2 = p2.matcher(p.getTime());
			int hour2 = 0;
			int minute2 = 0;
			if (m2.matches()) {
				String hourstr = m2.group(1);
				String minutestr = m2.group(2);
				hour2 = Integer.parseInt(hourstr);
				minute2 = Integer.parseInt(minutestr);
			}
			if ((hour2 > hour1) | (hour1 == hour2 & minute2 > minute1) & day.equals(p.getDay())) {
				System.out.println(p.toString());
			}
		}
	}
}
