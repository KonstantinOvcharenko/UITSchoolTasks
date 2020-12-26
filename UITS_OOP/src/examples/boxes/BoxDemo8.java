package examples.boxes;

public class BoxDemo8 {
	public static void main(String[] args) {
		Box mybox = new Box(10, 20, 15);

		double vol;

		vol = mybox.volume();
		System.out.println("Volume is: " + vol);

		mybox = null;
	}
}
