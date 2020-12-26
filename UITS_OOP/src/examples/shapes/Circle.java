package examples.shapes;

public class Circle extends Shape implements Moveable {
	protected int x, y, r;

	public Circle(int x, int y, int r, String color) {
		super(color);
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void draw() {
		System.out.println("Drawing circle(x=" + x + ", y=" + y + ", radius=" + r + ", color=" + color + ")");
	}

	public void moveToDefaultPosition() {
		x = defaultX;
		y = defaultY;
	}

	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

	public void moveLeft() {
		x--;
	}

	public void moveRight() {
		x++;
	}
}
