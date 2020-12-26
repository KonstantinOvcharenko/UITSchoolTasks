package examples.boxes;

public class Box {
	double width;
	double height;
	double depth;

	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	Box(double width, double height, double depth) {
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	Box(double len) {
		width = height = depth = len;
	}

	double volume() {
		return width * height * depth;
	}

	protected void finalize() {
		System.out.println("Godbye Box!");
	}
}
