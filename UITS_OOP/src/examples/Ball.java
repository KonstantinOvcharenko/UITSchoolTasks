package examples;

public class Ball {
	public static int count = 0;

	static int getCount() {
		return count;
	}

	private String color = "none";

	public Ball(String color) {
		this.color = color;
		count++;
	}

	protected void finalize() {
		System.out.println("ASD");
		count--;
	}
}